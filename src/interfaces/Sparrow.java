package interfaces;

public class Sparrow implements IFlying, IFooding, IJumping {

	boolean isStarving = true;
	boolean isJumping = false;
	boolean isWingsMoving = false;
	boolean isWalking = false;
	double currentHeight = 0;
	
	@Override
	public void startJumping(int jumpnumber) {
		isJumping = true;
		System.out.println("Jumping " + jumpnumber + " times.");
	}

	@Override
	public void jumpHeight(double height) {
		if (height > 0) {
			System.out.println("Will jump on Jumping at height " + height);	
		} else {
			System.out.println("Could not jump on " + height);	
		}
			
	}

	@Override
	public boolean feelingStarve() {
		return isStarving;
	}

	@Override
	public void eatSomething(Object food) {
		if (food != null) {
			isStarving = false;
		} else {
			isStarving = true;
		}
		
	}

	@Override 
	public void flyAtDistance(double distance) {
		if (isWingsMoving) {
			System.out.println("I'm flying at distance:" + distance + " meters");
		} else {
			System.out.println("To fly i need to start Wings Moving");
		}
	}

	@Override
	public void takeOff(double height) {
		
		if (height < maxHeight  && height > currentHeight) {
			if (!isWingsMoving) {
				isWingsMoving = true;
			}
		
			if (isWalking) {
				isWalking = false;
			}
		
			System.out.println("I'm take off at height:" + height + " meters");
			currentHeight = currentHeight + height;
		} else {
			System.out.println("To take off I need height to be more than " + currentHeight + " and less than " + maxHeight);
		}
			
	}
	
	@Override
	public void landing(double height) {
		if (height > 0 && height < currentHeight) {
			System.out.println("I'm landing to " + height + " meters");
			currentHeight = height;
		} else {
			if (currentHeight == 0) {
				System.out.println("To landing you need take off before");
			} else {
				System.out.println("To landing I need height to be more than 0 and less than " + currentHeight);
			}
		}
	}

	@Override
	public void sitDown() {
		System.out.println("I'm on land now");
		isWingsMoving = false;
		currentHeight = 0;
	}

	@Override
	public void stopJumping() {
		isJumping = false;
		
	}

	
	
	
}
