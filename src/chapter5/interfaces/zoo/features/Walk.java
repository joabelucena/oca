package chapter5.interfaces.zoo.features;

public interface Walk {
	public default int getSpeed() {
		return 5;
	}

}
