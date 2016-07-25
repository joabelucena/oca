package chapter5.zoo.constructors;

import chapter5.zoo.Animal;

public class Gorilla extends Animal {
	
	
	/*
	 * Constructors
	 */
	public Gorilla(int age){
		super(age, "Gorilla");
	}
	
	public Gorilla(){
		super(5);
	}
}
