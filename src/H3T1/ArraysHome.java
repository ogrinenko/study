package H3T1;

import java.util.Arrays;
import java.util.Random;

public class ArraysHome {

	//int arrayFromRandom [] = new int[10];
	
	
	public int[] fillArrayWithRandom(int[] array)
	{
		Random newRan = new Random();
		for (int i = 0;  i < array.length ;i++)
		{
			array[i] = newRan.nextInt(100);
		}
		return array;
	}
	
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
	
	
	public void printEachCharacterOfStringInNewLine(String str)
	{
		char[] charArray = str.toCharArray();
		for (char c : charArray)
		{
			System.out.println(c);
		}
	}
	
	
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
	
	
	public int[] reverceSortingOfIntArray(int[] array)
	{
		
		
		
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
		
		// Task 6 - switch value of two variable without addditional one
		int firstValue = 10;
		int secondValue = 15;
		System.out.println("First Value: " + firstValue + ", Second Value: " +  secondValue);
		
		firstValue = firstValue + secondValue;
		secondValue = firstValue - secondValue;
		firstValue = firstValue - secondValue;
		
		System.out.println("First Value: " + firstValue + ", Second Value: " +  secondValue);
		
		// Task 7 - Array Reverse Sorting
		int[] newReverseArray = new int[10];
		newReverseArray = myArrays.fillArrayWithRandom(newReverseArray);
		System.out.println("Array - " + Arrays.toString(newReverseArray));
		newReverseArray = myArrays.reverceSortingOfIntArray(newReverseArray);
		System.out.println("Reversed Array is:" + newReverseArray);
		
		
		
	}

}
