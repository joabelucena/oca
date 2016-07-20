package chapter4.pond.swan;

import chapter4.pond.shore.Bird;

public class Sawn extends Bird {
	
	public void swim(){
		floatInWater();						//package access to superclass
		System.out.println(text);			//package access to superclass
	}
	
	public void helpOtherSwanSwim(){
		Sawn other = new Sawn();			//package access to superclass
		other.floatInWater();				//package access to superclass
		System.out.println(other.text);
	}
	
	public void helpOtherBirdSwim(){
		Bird other = new Bird();
		other.floatInWater();				//DOES NOT COMPILE
		System.out.println(other.text);		//DOES NOT COMPILE
	}

}
