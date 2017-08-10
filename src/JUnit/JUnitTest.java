package JUnit;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnitTest {
	
	
	
	
	

	@Before 
	public  void beforeTest() {
		System.out.println("Before");
	}
	
	@After 
	public void afterTest() {
		System.out.println("After");
	}
	
	
	@Test 
	public void firstTest() {
		System.out.println("1");
	}
	
	@Test 
	public void secondTest() {
		System.out.println("2");
	}
	
	@AfterClass
	public static void afterAllTests() {
		System.out.println("Exit");
	}
	
	
	@BeforeClass
	public static void beforeAllTests() {
		//final int t = 10;
		System.out.println("Enter");
	}
	
	
	@Test 
	public void thirdTest() {
		System.out.println("3");
	}
	
	@Test(expected=ArithmeticException.class)
	public void TestValidatesZeroDivision() {
		
	//	try {
			
		
		// Arrange
		Random ran = new Random();
		int firstNUmber = ran.nextInt(1000);
		int secondNumber = 0;
		//double actualResult = 0;
		Division div = new Division();
		
		// Act
		
		double actualResult = div.divideTwoNumbers(firstNUmber, secondNumber);
		
		// Assert
		
		
		
//		} catch (Exception exc) {
//			System.out.println(exc.getMessage());
//			Assert.assertTrue(exc.getMessage(), false);
//		} catch (Error err) {
//			System.out.println(err.getMessage());
//		}
		
	}
	
}
