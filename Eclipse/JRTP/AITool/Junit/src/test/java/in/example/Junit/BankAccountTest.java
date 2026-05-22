package in.example.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountTest {

	
	@Test
	public void testWithDrawSuccess() {
		BankAccount bankAccount = new BankAccount();
		
		int balance = bankAccount.withdraw(10000, 6000);
		
		assertEquals(4000, balance);
	}
	
	@Test
	public void testWithDrawFailure() {
		BankAccount bankAccount = new BankAccount();
		int balance = bankAccount.withdraw(10000, 12000);
		
		assertEquals(-1, balance);
	}
}
