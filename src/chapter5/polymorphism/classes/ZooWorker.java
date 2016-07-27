package chapter5.polymorphism.classes;

import chapter5.polymorphism.interfaces.Reptile;

public class ZooWorker {
	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile: " + reptile.getName());
	}
	
	public static void main(String...args) { 
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile() {
		});
	}
}
