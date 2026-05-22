package in.example.Junit;

public class BankAccount {

	public int withdraw(int balance, int amount) {
		
		if( amount > balance) {
			return -1;
		}
		
		return balance-amount;
	}
}
