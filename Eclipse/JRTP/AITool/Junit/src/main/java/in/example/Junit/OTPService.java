package in.example.Junit;

public class OTPService {
	
	public boolean verifyOTP( int enteredOTP ) {
		int orginalOTP = 123456;
		
		return orginalOTP == enteredOTP;
	}
}
