package JUnit;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

public class StrToIntJUnit {
	
	//Preparing  arrays to be used to test - strToInt
	private static String[] strArrayCorrect = new String[20];	
	private static String[] strArrayIncorrect = new String[20];	
	
	// initialization of   arrays to be used to test - strToInt
	@BeforeClass
	public static void strToInt_Prepare_Data() {
		Random ran = new Random();
		for (int i =0; i < strArrayCorrect.length; i++) {
			strArrayCorrect[i] = String.valueOf(ran.nextInt(100));
		}
		for (int i =0; i < strArrayIncorrect.length; i++) {
			if (i%2 == 0) {
				strArrayIncorrect[i] = "LoL:" + i;
			} else {
				strArrayIncorrect[i] = String.valueOf(i);
			}
		}
	}
	
	// Catch NumberFormatException
	@Test(expected=NumberFormatException.class)
	public void strToInt_NumberFormatException() {
		
		// Arrange
		StrToInt obj = new StrToInt();
		
		// Act
		obj.strToInt(strArrayIncorrect);		
		
	}
	
	// Check correct method work
	@Test
	public void strToInt_CorrectArray() {
		
		// Arrange
		StrToInt obj = new StrToInt();
		
		// Act
		obj.strToInt(strArrayCorrect);		
		
	}
	
	// Check method for empty array incoming
	@Test(expected=NullPointerException.class)
	public void strToInt_empty_Input() {
		
		// Arrange
		StrToInt obj = new StrToInt();
		
		//Act
		obj.strToInt(null);
	}
	

}
