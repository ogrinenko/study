package JUnit;

import java.util.Arrays;

public class FrogJumping {

	
	// Create array for Lamps
	public static boolean[] lamps = new boolean[100];
	
	/**
	 * Change lamp status -true/false- based on lamp number
	 * @param lampNumber
	 */
	public static void switchLampStatus(int lampNumber) {
		lamps[lampNumber] = lamps[lampNumber] ? false : true;
	}
	
	/**
	 * Simulate pressing of lamp by Frog jump
	 * @param frogNumber
	 */
	public static void press(int frogNumber) {
		for (int i = frogNumber-1 ; i < lamps.length; i=i+frogNumber) {
			
			switchLampStatus(i); 
		}
	}
	
	
	
	
	
	public static void main(String[] args) {

		//Form array with lamps
		for (int i = 0; i < 100; i++) {
			lamps[i] = false;
		}
		// Print out array before Frogs jump
		System.out.println("Before" + Arrays.toString(lamps));
		
		// Jump frogs with numbers from 0 to 99 (100 Frogs)
		FrogJumping.press(4);
		// Print out array after Frogs jump
		System.out.println("After" + Arrays.toString(lamps));
	}

}
