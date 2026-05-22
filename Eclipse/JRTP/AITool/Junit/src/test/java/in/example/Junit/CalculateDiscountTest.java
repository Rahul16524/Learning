package in.example.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculateDiscountTest {
	
	@Test
	public void testPremiumDiscount() {
		CalculateDiscount service = new CalculateDiscount();
		double result = service.calculateDiscount(7000);
		assertEquals(1400, result);
		
	}
	
	@Test
	public void testNormalDiscount() {
		CalculateDiscount service = new CalculateDiscount();
		double result = service.calculateDiscount(4000);
		assertEquals(400, result);
	}
}
