package promotion.calculator.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import promotion.calculator.impl.APromotionCalculatorImpl;

class APromotionCalculatorTest {

	APromotionCalculatorImpl calculatorImpl = new APromotionCalculatorImpl();
	
	@Test
	void testWithCorrectInput() {
		
		int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5);
		assertEquals(230, calculatePromotionlVal);
	}
	
	@Test
	void testWithWrongInput() {
	int calculatePromotionlVal = calculatorImpl.calculatePromotionlVal(5);
	assertEquals(290, calculatePromotionlVal);
}

}
