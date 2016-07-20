package chapter4.pond.duck;

@SuppressWarnings("unused")
public class FatherDuck {

	private String noise = "quack";
	
	private void quack(){
		System.out.println(noise);	// private access ok
	}
	
	private void makeNoise(){
		quack();					// private access ok
	}

}
