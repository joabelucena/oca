package chapter4.pond.duck;

public class GoodDuckling {

	public void makeNoise(){
		MotherDuck duck = new MotherDuck();
		duck.quack();						//DEFAULT ACCESS OK
		System.out.println(duck.noise);		//DEFAULT ACCESS OK
	}

}
