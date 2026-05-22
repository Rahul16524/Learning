package in.example.Junit;

public class CalculateDiscount {

	public double calculateDiscount(double amount) {
		if( amount > 5000) {
			return amount *0.2;
		}
		
		return amount*0.1;
	}
}
