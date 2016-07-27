package chapter5.polymorphism.classes;

public class Bird {
	public String getName() {
		return "Unknown";
	}
	
	public void displayInfo() {
		System.out.println("The bird name is: " + getName());
	}
}
