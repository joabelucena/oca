package chapter5.interfaces.zoo.features;

public interface Omnivore {

	//Same in Hebivore interface
	public void eatPlants();
	
	//Conflicting method, same name but different return type
	public int crap();
	
	public int eatPlants(int a);
	public void eatMeat();
}
