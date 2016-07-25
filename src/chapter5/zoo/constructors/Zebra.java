package chapter5.zoo.constructors;

import chapter5.zoo.Animal;

public class Zebra extends Animal{
	public Zebra(int age){
		super(age);
		System.out.println("Zebra(int age) constructor");
	}
	
	public Zebra(){
		this(4);
		
		System.out.println("Zebra() constructor that calls this(int age) constructor");
	}
	
	public static void main(String[] args) {
		Zebra z = new Zebra();
		System.out.println(z);
	}
}
