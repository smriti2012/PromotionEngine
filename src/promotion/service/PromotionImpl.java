package promotion.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Cart;
import model.Product;
import promotion.calculator.impl.APromotionCalculatorImpl;
import promotion.calculator.impl.BPromotionCalculatorImpl;
import promotion.calculator.impl.CDPromotionCalculatorImpl;

public class PromotionImpl {

	TotalPromotionCalculator calculator = new TotalPromotionCalculator();

	public int calculateTotalOrderVal(Cart cart) {
		Map<Character, Integer> productMap = new HashMap<Character, Integer>();
		int totalPromotionalVal = 0;
		List<Product> products = cart.getProducts();
		products.stream().forEach(i -> {
			if (productMap.containsKey(i.getSku()))
				productMap.put(i.getSku(), productMap.get(i.getSku()) + 1);
			else
				productMap.put(i.getSku(), 1);
		});
		try {
			totalPromotionalVal = calculator.totalPromotionalVal(productMap, new APromotionCalculatorImpl(),
					new BPromotionCalculatorImpl(), new CDPromotionCalculatorImpl());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return totalPromotionalVal;
	}

	public static void main(String args[]) {
		PromotionImpl promotionImpl = new PromotionImpl();
		List<Product> productList = Arrays.asList(new Product('A', 50), new Product('A', 50), new Product('A', 50),
				new Product('A', 50), new Product('A', 50), new Product('B', 30), new Product('B', 30),
				new Product('B', 30), new Product('C', 20), new Product('C', 20), new Product('D', 15),
				new Product('D', 15), new Product('D', 15));
		Cart cart = new Cart(productList);
		System.out.println(promotionImpl.calculateTotalOrderVal(cart));

	}

}
