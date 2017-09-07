package JUnit;

import java.util.ArrayList;
import java.util.Arrays;

public class StrToInt {

	/**
	 * Method that converts String elements of array into Int numbers
	 * @param stringArray
	 * @throws NumberFormatException
	 */
	public void strToInt(String[] stringArray) throws NumberFormatException  {
		boolean incomingArrayContainsIncorrectElements = false;
		ArrayList<String> arrayOfIncorrectElements = new ArrayList<>();
		
		for (int i =0; i < stringArray.length; i ++) {
		
			System.out.println("String:" + stringArray[i]);
			try {
				int intFromString = Integer.parseInt(stringArray[i]);
				System.out.println("Int:" + intFromString);
			} catch (NumberFormatException e) {
				System.out.println("Skipping:" + stringArray[i] + " incorrect INt element." );
				incomingArrayContainsIncorrectElements = true;
				arrayOfIncorrectElements.add(stringArray[i]);
			}
		}

		if ((incomingArrayContainsIncorrectElements) && (!arrayOfIncorrectElements.isEmpty())) {
			System.out.println("Skipped array elements: " + Arrays.toString(arrayOfIncorrectElements.toArray()));
			throw new NumberFormatException();
		}
		
	}
	
	
	
	
}
