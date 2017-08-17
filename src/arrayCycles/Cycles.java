package arrayCycles;

public class Cycles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean bool = new Boolean(true);
		Integer intA = 5;

		while (bool) {
			System.out.println("inside");
			intA--;
			if (intA == 1) {
				bool = false;
			}
		}

	}

}
