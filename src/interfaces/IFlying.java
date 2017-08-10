package interfaces;

public interface IFlying {

	double maxHeight = 1000;
	
	void flyAtDistance(double distance);
	void takeOff (double height);
	void landing(double height);
	void sitDown();
}
