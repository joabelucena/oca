package chapter5.interfaces.zoo;

import chapter5.interfaces.zoo.features.Herbivore;
import chapter5.interfaces.zoo.features.Omnivore;

/*
 * DOES NOT COMPILE: crap() is crapping all over here :/
 */
public abstract class AbstractBear implements Herbivore, Omnivore {

	@Override
	public int crap() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eatPlants(int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void eatMeat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub

	}

}
