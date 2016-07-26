package chapter5.interfaces.zoo.features;

public interface Carnivore {
	//DOES NOT COMPILE: 'default' methods requires body
	public default void eatMeat();
	
	//DOES NOT COMPILE: abstract methods may not have a body
	public int getRequiredFoodAmount() {
		return 13;
	}

}
