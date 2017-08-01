package T1;

import arrayCycles.Array;

public class TestClass {
	
	
	public TestClass()
	{
		System.out.println("Test Class Constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		TestClass tC = new TestClass();
		
		Array arr = new Array();
		arr.printSomeArray();
		
	}

}
