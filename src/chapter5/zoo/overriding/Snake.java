package chapter5.zoo.overriding;

public class Snake extends Reptile {
	protected boolean hasLegs(){
		return false;
	}
	protected double getWeight() throws InsufficientDataException {
		return 2;
	}

}
