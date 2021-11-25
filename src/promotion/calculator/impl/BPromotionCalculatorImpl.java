package promotion.calculator.impl;

import promotion.calculator.SingleSkuPromotionCalculator;

public class BPromotionCalculatorImpl implements SingleSkuPromotionCalculator {

	@Override
	public int calculatePromotionlVal(int qty) {
		
		return (qty / 2) * 45 + (qty % 2) * 30;
	}

}
