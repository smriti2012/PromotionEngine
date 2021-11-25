package promotion.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.OrderWrapper;
import model.Product;

public class PromotionImpl implements ASKUPromotion, BSKUPromotion, SkuCombinationPromotion {

	public static void main(String[] args) {

		// Create cart list
		List<Product> cartItems = new ArrayList<Product>();
		Product Aobj = new Product('A', 50);
		Product Bobj = new Product('B', 30);
		Product Cobj = new Product('C', 20);
		Product Dobj = new Product('D', 15);
		cartItems=Arrays.asList(Aobj,Aobj,Aobj,Aobj,Bobj,Bobj,Bobj,Cobj,Dobj,Dobj);

		// convert to map with product and it's count
		Map<Product, Integer> productQty = new HashMap<Product, Integer>();
		cartItems.stream().forEach(i -> {
			if (productQty.containsKey(i))
				productQty.put(i, productQty.get(i) + 1);
			else
				productQty.put(i, 1);
		});
		// fetch total Order value
		final OrderWrapper totalOrderVal = new OrderWrapper();
		productQty.entrySet().forEach(i -> {
			try {
				if (i.getKey().getSku() == 'A') {
					totalOrderVal.totalValue += ASKUPromotion.getPromotionForASKU(i);
				} else if (i.getKey().getSku() == 'B')
					totalOrderVal.totalValue += BSKUPromotion.getPromotionForBSKU(i);
				else if (i.getKey().getSku() == 'C')
					totalOrderVal.counterOfC = i.getValue();
				else
					totalOrderVal.counterOfD = i.getValue();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		});
		try {
			totalOrderVal.totalValue += SkuCombinationPromotion.getPromotionforCAndD(totalOrderVal.counterOfC,
					totalOrderVal.counterOfD);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// print total order value
		System.out.println("Total order value= " + totalOrderVal.totalValue);
	}

}
