package chapter5.zoo.constructors;

public class Elephant extends Mammal {
	
	/*
	 * DOES NOT COMPILE: Mammal has a defined constructor ( Mammal(int age) ) and since
	 * that, Java did not create a no-argument default constructor. Otherwise, Elephant
	 * has no constructors at all and whe Java tries to create a default constructor, it
	 * calls super() and since it is never found, the code does not compile.  
	 */
	
	
	//Added to make code compile
	public Elephant() {
		super(3);
	}
	public static void main(String[] args) {
		Elephant el = new Elephant();
	}

}
