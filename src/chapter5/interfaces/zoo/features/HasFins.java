package chapter5.interfaces.zoo.features;

public interface HasFins {
	
	public default int getNumberOfFins(){
		return 4;
	}
	public default double getLongestFinLength() {
		return 20.0;
	}
	public default boolean doFinsHaveScales() {
		return true;
	}
	
}
interface SharkFamily extends HasFins {
	
	public default int getNumberOfFins() {
		return 8;
	}
	public double getLongestFinLength();
	
	//DOES NOT COMPILE: abstract methods may not have a body
	public boolean doFinsHaveScales() {
		return false;
	}
}
