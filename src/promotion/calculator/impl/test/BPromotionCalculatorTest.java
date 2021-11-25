package promotion.calculator.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import promotion.calculator.impl.BPromotionCalculatorImpl;

class BPromotionCalculatorTest {

	@Test
	void test() {
		BPromotionCalculatorImpl calculatorImpl = new BPromotionCalculatorImpl();
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5);
		assertEquals(230, calculatePromotionlVal);
	}

}
