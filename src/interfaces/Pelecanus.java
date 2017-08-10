package interfaces;

public class Pelecanus implements IFlying, IWalking , ISwimming, IFooding {

	boolean starving = true;	
	boolean isWingsMoving = false;
	boolean isWalking = false;
	double currentDepth = 0;
	double currentHeight = 0;
	
	@Override
	public boolean feelingStarve() {
		return starving;
	}

	@Override
	public void eatSomething(Object food) {
		if (food != null) {
			starving = false;
		} else {
			starving = true;
		}
		
	}

	@Override
	public void dive(double divingDepth) {
		if (currentDepth < divingDepth) {
			currentDepth = divingDepth;
			System.out.println("I'm dive in " + divingDepth + " meters, and now I'm at " + currentDepth);
		} else {
			System.out.println("I'm on " + currentDepth + " and could not dive at " + divingDepth);
		}
			
	}
	
	@Override
	public void topUp(double topUpDepth) {
		if (currentDepth >  topUpDepth && topUpDepth > 0) {
			currentDepth = topUpDepth;
			System.out.println("I'm top up on " + topUpDepth + " meters, and now I'm at "+ currentDepth);
		} else {
			System.out.println("I'm on " + currentDepth + " and could not top up on " + topUpDepth);
		}
	}

	@Override
	public void swimAtDistance(double distance) {
		System.out.println("I'm swimming at distance:" + distance + " meters");
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
	public void startWalking() {
		isWalking = true;
	}

	@Override
	public void stopWalking() {
		isWalking = false;
	}

	
}
