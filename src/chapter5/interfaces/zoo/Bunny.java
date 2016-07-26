package chapter5.interfaces.zoo;

import chapter5.interfaces.zoo.features.Hop;

public class Bunny implements Hop {
	
	/*
	 * DOES NOT COMPILE: without an explicit reference to the name of the interface, 
	 * an interface-static method cannot be called
	 */
	public void printDetails() {
		System.out.println(getJumpHeight());
	}
	
	/*
	 * This compiles since the interface is being referenced
	 */
	public void printJumpDetails() {
		System.out.println(Hop.getJumpHeight());
	}
	

}
