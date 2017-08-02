package H3T1;

import java.util.Arrays;
import java.util.Random;

public class ArraysHome {

	/**
	 * Method fill any array  with Random Int numbers
	 * @param array
	 * @return
	 */
	public int[] fillArrayWithRandom(int[] array)
	{
		Random newRan = new Random();
		for (int i = 0;  i < array.length ;i++)
		{
			array[i] = newRan.nextInt(100);
		}
		return array;
	}
	
	/**
	 * Method finds maximum element in array 
	 * @param array
	 * @return
	 */
	public int findMaximumInArray(int[] array)
	{
		int res = array[0];
		for (int i = 1;  i < array.length ;i++)
		{
			if (array[i] > res)
			{
				res = array[i];
			}
		}
		return res;
	}
	
	/**
	 * Calculate and return SUMM of all Even items in Array
	 * @param array
	 * @return
	 */
	public int summOfAllEvenItemsInArray(int[] array)
	{
		int res = 0;
		for (int i = 1;  i < array.length ;i += 2)
		{
			if (array[i] > res)
			{
				res += array[i];
			}
		}	
		return res;
	}
	
	
	/**
	 * Finds minimum Odd element in Array
	 * @param array
	 * @return
	 */
	public int findMinOddItemInArray(int[] array)
	{
		int min = array[0];
		for (int i = 0;  i < array.length ;i += 2)
		{
			if (array[i] < min)
			{
				min = array[i];
			}
		}
		return min;
	}
	
	/**
	 * Method prints input String by each characters from new Line
	 * @param str
	 */
	public void printEachCharacterOfStringInNewLine(String str)
	{
		char[] charArray = str.toCharArray();
		for (char c : charArray)
		{
			System.out.println(c);
		}
	}
	
	/**
	 * Method prints numbers from 1 to 100 and replace numbers that could be divided in 3 to Fizz, 
	 * divided in 5 to Buzz and could be divided in both 3 and 5 to  FizzBuzz
	 * @param startNumber
	 * @param stopNumber
	 */
	public void printNumbersThatCouldBeDividedToThreeAndFive(int startNumber, int stopNumber) {
		System.out.println("Numbers from 1 to 100:");
		
		for (int i = 1; i < 101; i ++)
		{
			if ((i%3 == 0) && (i%5 == 0))
			{
				System.out.println("FizzBuzz");
			}
			else if (i%3 == 0)
			{
				System.out.println("Fizz");
			}
			else if (i%5 == 0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Method prints Array in reverse order
	 * @param array
	 * @return
	 */
	public int[] reverseSortingOfIntArray(int[] array)
	{
		for (int i = 0; i < array.length/2; i++)
		{
			int tmp = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = tmp;
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		// Create new ArraysHome object
		ArraysHome myArrays = new ArraysHome();
		
		// Task 1 - create array with 10 items and find max
		int[] newArray = new int[10]; 
		newArray  = myArrays.fillArrayWithRandom(newArray); 
		System.out.println("Array - " + Arrays.toString(newArray));
		double maxInArray = myArrays.findMaximumInArray(newArray);
		System.out.println("Max item in current Array is:" + maxInArray );
		
		//Task 2 - Summ of all even numbers in Array
		int[] newIntArray = new int[7];
		newIntArray = myArrays.fillArrayWithRandom(newIntArray);
		System.out.println("Array - " + Arrays.toString(newIntArray));
		int summOfArray = myArrays.summOfAllEvenItemsInArray(newIntArray);
		System.out.println("Summ of even items in Array is:" + summOfArray);
	
		// Task 3 - Find minimal Odd item
		int[] newMinOddArray = new int[5];
		newMinOddArray = myArrays.fillArrayWithRandom(newMinOddArray);
		System.out.println("Array - " + Arrays.toString(newMinOddArray));
		int minOddInArray = myArrays.findMinOddItemInArray(newMinOddArray);
		System.out.println("Min Odd item in Array is:" + minOddInArray);
		
		// Task 4 - Print String by each character from new line
		String myString = "Hello Arrays!";
		myArrays.printEachCharacterOfStringInNewLine(myString);
		
		// Task 5 - Print numbers from 1 to 100 and replace % 3/5 to Fizz and Buzz
		myArrays.printNumbersThatCouldBeDividedToThreeAndFive(1,100);
		
		// Task 6 - switch value of two variable without additional one
		int firstValue = 10;
		int secondValue = 15;
		System.out.println("First Value: " + firstValue + ", Second Value: " +  secondValue);
		
		firstValue = firstValue + secondValue;
		secondValue = firstValue - secondValue;
		firstValue = firstValue - secondValue;
		
		System.out.println("First Value: " + firstValue + ", Second Value: " +  secondValue);
		
		// Task 7 - Array Reverse Sorting
		int[] newReverseArray = new int[9];
		newReverseArray = myArrays.fillArrayWithRandom(newReverseArray);
		System.out.println("Array - " + Arrays.toString(newReverseArray));
		newReverseArray = myArrays.reverseSortingOfIntArray(newReverseArray);
		System.out.println("Reversed Array is:" + Arrays.toString(newReverseArray));
		
	}

}
