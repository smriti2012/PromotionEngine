package promotion.service;

import java.util.Map;

import promotion.calculator.SingleSkuPromotionCalculator;
import promotion.calculator.TwoSkuPromotionCalculator;
import promotion.exception.InvalidProductException;

public class TotalPromotionCalculator {

	public int totalPromotionalVal(Map<Character, Integer> products, SingleSkuPromotionCalculator APromo,
			SingleSkuPromotionCalculator BPromo, TwoSkuPromotionCalculator CDPromo) throws Exception {
		int promotionalPrice = 0;
		int cCounter = 0;
		int dCounter = 0;
		if (products.containsKey('A'))
			promotionalPrice += APromo.calculatePromotionlVal(products.get('A'));
		if (products.containsKey('B'))
			promotionalPrice += BPromo.calculatePromotionlVal(products.get('B'));
		if (products.containsKey('C'))
			cCounter += products.get('C');
		if (products.containsKey('D'))
			dCounter += products.get('D');
//		else
//			throw new InvalidProductException("Please provide valid product data");
		if (cCounter != 0 && dCounter != 0)
			promotionalPrice += CDPromo.calculatePromotionlVal(cCounter, dCounter);
		else if (cCounter > 0)
			promotionalPrice += cCounter * 20;
		else if (dCounter > 0)
			promotionalPrice += dCounter * 15;
		return promotionalPrice;
	}

}
