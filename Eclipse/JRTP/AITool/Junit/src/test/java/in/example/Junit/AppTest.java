package in.example.Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void pestApp() {
		App app = new App();
		
		int result = app.add(2, 3);
		
		assertEquals(5, result);
	}
}