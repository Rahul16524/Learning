package in.example.Junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OTPServiceTest {
	
	@Test
	public void testCorrectOTP() {
		OTPService service = new OTPService();
		
		assertTrue(service.verifyOTP(123456));
	}
	
	@Test
	public void testWrongOTP() {
		OTPService service = new OTPService();
		assertFalse(service.verifyOTP(987654));
	}
}
