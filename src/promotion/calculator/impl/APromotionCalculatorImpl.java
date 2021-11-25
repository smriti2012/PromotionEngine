package promotion.calculator.impl;

import promotion.calculator.SingleSkuPromotionCalculator;

public class APromotionCalculatorImpl implements SingleSkuPromotionCalculator {

	@Override
	public int calculatePromotionlVal(int qty) {
		
		return (qty/ 3) * 130 + (qty % 3) * 50;
	}

}
