package chapter5.interfaces.zoo;

import chapter5.interfaces.zoo.features.Herbivore;
import chapter5.interfaces.zoo.features.Omnivore;

public class Bear implements Herbivore, Omnivore {

	@Override
	public void eatMeat() {
		System.out.println("Eating meat..");

	}
	
	/*
	 * In this case, since both methods in both interfaces has the same signature,
	 * one implementation is enough. But, if they had the same name with a different
	 * signature, you must implement both
	 * 
	 * (non-Javadoc)
	 * @see chapter5.interfaces.zoo.features.Herbivore#eatPlants()
	 */
	@Override
	public void eatPlants() {
		System.out.println("Eating plants");

	}
	
	@Override
	public int eatPlants(int a){
		return 0;
	}
	
	/*
	 * DOES NOT COMPILE: This method appears in both interfaces with different signatures
	 * 
	 * (non-Javadoc)
	 * @see chapter5.interfaces.zoo.features.Herbivore#crap()
	 */
	@Override
	public void crap(){
		
	}

}
