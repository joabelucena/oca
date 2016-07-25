package chapter5.inheritance.zoo.modifiers;

class Fish {
	protected int size;
	private int age;

	public Fish(int age) {
		this.age = age;
	}

	//No modifier method. Can be called from a 'same-file' class
	int getAge() {
		return age;
	}
}

public class Shark extends Fish {
	private int numberOfFins = 8;

	public Shark(int age) {
		super(age);
		this.size = 4;
	}

	/*
	 * These are overloaded methods for showing many ways to access member. The
	 * parameters are used just for overloading
	 */
	// raw calling
	public void displaySharkDetails() {
		System.out.print("Shark with age: " + getAge());
		System.out.print(" and " + size + " meters long");
		System.out.print(" with " + numberOfFins + " fins");
		
		System.out.println();
	}

	// 'this' call only
	public void displaySharkDetails(int a) {
		System.out.print("Shark with age: " + this.getAge());
		System.out.print(" and " + this.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
		
		System.out.println();
	}

	// 'this' and 'super' call
	public void displaySharkDetails(int a, int b) {
		System.out.print("Shark with age: " + super.getAge());
		System.out.print(" and " + super.size + " meters long");
		System.out.print(" with " + this.numberOfFins + " fins");
		
		System.out.println();
	}

	public static void main(String[] args) {
		Shark sh = new Shark(16);

		sh.displaySharkDetails();
		sh.displaySharkDetails(1);
		sh.displaySharkDetails(1,2);
	}
}
