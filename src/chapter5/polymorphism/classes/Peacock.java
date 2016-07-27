package chapter5.polymorphism.classes;

public class Peacock extends Bird {
	public String getName() {
		return "Peacock";
	}
	
	public static void main(String...args) {
		Bird bird = new Peacock();
		bird.displayInfo();
	}

}
