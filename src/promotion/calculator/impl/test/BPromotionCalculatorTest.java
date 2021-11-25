package promotion.calculator.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import promotion.calculator.impl.BPromotionCalculatorImpl;

class BPromotionCalculatorTest {

	BPromotionCalculatorImpl calculatorImpl = new BPromotionCalculatorImpl();

	@Test
	void testWithCorrectInput() {
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5);
		assertEquals(120, calculatePromotionlVal);
	}
	
	@Test
	void testWithWrongInput() {
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5);
		assertEquals(25, calculatePromotionlVal);
	}

}
