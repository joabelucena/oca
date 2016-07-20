package chapter4.pond.goose;

import chapter4.pond.shore.Bird;

public class Goose extends Bird {
	
	public void helpGooseSwim(){
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}
	
	/*
	 * Although the object happens to be a Goose, it is stored in a Bird reference.
	 * We are not allowed to refer to members of the Bird since we are not in the 
	 * same package and Bird is not a subclass of Bird.
	 */
	public void helpOtherGooseSwim(){
		Bird other = new Goose();
		other.floatInWater();				//DOES NOT COMPILE
		System.out.println(other.text);		//DOES NOT COMPILE
	}
}
