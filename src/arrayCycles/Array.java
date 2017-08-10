package arrayCycles;

import java.util.Arrays;

public class Array {
	
	int [] numbers = {1,2,4};
	int [] num = new int[10];
	Object [] myObj = new Object[3];
	
	
	
	public Array(){
		//System.out.println("gg");
		//System.out.println(num[10]);
		
	}
	
	
	public boolean printSomeArray()
	{
		boolean a = false;
		System.out.println("gg");
		if (numbers == num)
		{
			a = true;
		}
		
		
		myObj[0] = "fffffff";
		myObj[1] = 1;
		System.out.println(Arrays.toString(myObj));
		//String tt = (String) myObj[1];
		System.out.println((byte)500);
		char t = 0x65;
		
		
		String arr = Arrays.toString(myObj);
		
		int  result = 0;
		String  sResult = "";
		for (int  all : numbers)
		{
			System.out.println(":"+all);
			result += all;
			sResult += all;
		}
		
		String s = "String";
		
//		for(char c : s.substring(0, s.length()))
//		{
//			System.out.println(c);
//		}
		
		System.out.println("GG" + result);
		System.out.println("GG" + sResult);
		return a;
	}
	
	

}
