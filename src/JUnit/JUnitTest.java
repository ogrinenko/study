package JUnit;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

	
	@Test
	public void TestValidatesZeroDivision() {
		
		try {
			
		
		// Arrange
		Random ran = new Random();
		int firstNUmber = ran.nextInt(1000);
		int secondNumber = 0;
		double actualResult;
		Division div = new Division();
		
		// Act
		
		actualResult = div.divideTwoNumbers(firstNUmber, secondNumber);
		
		// Assert
		
		
		
		} catch (Exception exc) {
			System.out.println(exc.getMessage());
			Assert.assertTrue(exc.getMessage(), false);
		} catch (Error err) {
			System.out.println(err.getMessage());
		}
		
	}
	
}
