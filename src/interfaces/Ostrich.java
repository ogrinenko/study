package interfaces;

public class Ostrich implements IFooding, IWalking  {

	boolean isStarving = true;
	boolean isWalking = false;
	
	@Override
	public void startWalking() {
		isWalking = true;
		
	}

	@Override
	public void stopWalking() {
		isWalking = false;
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

}
