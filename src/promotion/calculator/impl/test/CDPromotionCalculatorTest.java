package promotion.calculator.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import promotion.calculator.impl.CDPromotionCalculatorImpl;

class CDPromotionCalculatorTest {

	@Test
	void test() {
		CDPromotionCalculatorImpl calculatorImpl = new CDPromotionCalculatorImpl();
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5,8);
		assertEquals(230, calculatePromotionlVal);
	}

}
