package chapter5.abstraction.zoo;

abstract class Whale {
	private abstract void sing(); // DOES NOT COMPILE: 'private' member are not
									// visible for subclasses

	protected abstract void swim();
}

public class HumpbackWhale extends Whale {

	// This method is not considered an override because sing() is not visible
	// for subclasses
	private void sing() {
		System.out.println("Humpback whale is singing");
	}

	private void swim() { // DOES NOT COMPILE: The subclass cannot reduce the
							// visibility of a parent method.
		System.out.println("Swimming...");
	}
}
