package promotion.calculator.impl;

import promotion.calculator.TwoSkuPromotionCalculator;

public class CDPromotionCalculatorImpl implements TwoSkuPromotionCalculator {

	@Override
	public int calculatePromotionlVal(int Cqty,int Dqty) {
		
		if (Cqty < Dqty)
			return Cqty * 30 + (Dqty - Cqty) * 15;
		else
			return Dqty * 30 + (Cqty - Dqty) * 20;
	}

}
