package chapter4.pond.duck;

public class MotherDuck {

	String noise = "quack";
	
	void quack(){
		System.out.println(noise);	// default access ok
	}
	
	void makeNoise(){
		quack();					// default access ok
	}


}
