package promotion.calculator.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import promotion.calculator.impl.CDPromotionCalculatorImpl;

class CDPromotionCalculatorTest {

	CDPromotionCalculatorImpl calculatorImpl = new CDPromotionCalculatorImpl();

	@Test
	void testWithCorrectInput() {
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5, 8);
		assertEquals(195, calculatePromotionlVal);
	}

	@Test
	void testWithWrongInput() {
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5, 8);
		assertEquals(230, calculatePromotionlVal);
	}
}
