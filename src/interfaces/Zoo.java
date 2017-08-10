package interfaces;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelecanus myPelecan = new Pelecanus();
		myPelecan.dive(-100);
		myPelecan.dive(150);
		myPelecan.dive(100);
		myPelecan.dive(200);
		
		myPelecan.topUp(-100);
		myPelecan.topUp(100);
		myPelecan.topUp(-500);
		myPelecan.topUp(400);
		myPelecan.topUp(40);
		
		
		myPelecan.landing(50);
		myPelecan.takeOff(5000);
		myPelecan.takeOff(50);
		myPelecan.takeOff(-150);
		myPelecan.takeOff(500);
		myPelecan.takeOff(200);
		
		myPelecan.landing(450);
		myPelecan.landing(-450);
		myPelecan.landing(150);
		myPelecan.landing(1050);
		
		
		
		
	}

}
