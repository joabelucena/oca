package chapter4.pond.swan;

import chapter4.pond.duck.MotherDuck;

public class BadCygnet {

	public void makeNoise(){
		MotherDuck duck = new MotherDuck();
		duck.quack();						//DOES NOT COMPILE
		System.out.println(duck.noise);		//DOES NOT COMPILE
	}

}
