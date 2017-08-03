package collections;

import java.util.ArrayList;
import java.util.Arrays;



public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myArray = new ArrayList<String>(25); 
		
		myArray.add("Hello");
		
		System.out.println(myArray.size());
		
		myArray.add(1, "Hello1");
		myArray.add(1, "Hello");
		myArray.remove(1);
		
		
		System.out.println(Arrays.toString(myArray.toArray()) );
		
	}

}
