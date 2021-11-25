package promotion.calculator.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import promotion.calculator.impl.APromotionCalculatorImpl;

class APromotionCalculatorTest {

	@Test
	void testWithPositiveInput() {
		APromotionCalculatorImpl calculatorImpl = new APromotionCalculatorImpl();
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5);
		assertEquals(230, calculatePromotionlVal);
	}

}
