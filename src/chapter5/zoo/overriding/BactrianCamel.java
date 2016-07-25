package chapter5.zoo.overriding;

public class BactrianCamel extends Camel {
	
	/*
	 * DOES NOT COMPILE:
	 * 1. Return type is not the same os subclass
	 * 2. The child method is less accessible than parent 
	 */
//	private int getNumberOfHumps(){
//		return 2;
//	}
	
	/*
	 * COMPILES SUCCESSFULLY
	 * 
	 * Although the same signature, this method is not overriden from the parent class because,
	 * the method in the parent class is private and since than, is not accessible here.
	 */
	private String getNumberOfLegs(){
		return "4";
	}
}
