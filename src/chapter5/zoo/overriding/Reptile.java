package chapter5.zoo.overriding;

public class Reptile {
	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}
	
	protected double getWeight() throws Exception {
		return 2;
	}

}
