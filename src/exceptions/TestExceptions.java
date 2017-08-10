package exceptions;



public class TestExceptions {

	public static void divideTwoNumbers(int i, int m)
	{
		System.out.println(i/m);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		if (i > 0)
		{
			System.out.println("000");
			throw new ArithmeticException("Lolka");
		}
		
		try {
			divideTwoNumbers(0, 0);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("111" + e.getMessage());
			
		}
		catch (Exception e) {
		// TODO: handle exception
		System.out.println("222" + e.getMessage());
		}
				
		finally {
			
			
			
		}
		
	}

}
