package chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();

		// animal , hopper, swimmer
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, new CheckIfHopper()); // pass class that does check

		/*
		 * Lambdas Syntax
		 */
		// Braces and parentheses
		print(animals, (Animal a) -> {return a.canSwim();});

		// No braces then no 'return' keyword
		print(animals, (Animal a) -> a.canSwim());

		// nothing: When having just a parameter, you can omit almost everything
		print(animals, a -> a.canHop());


	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}

}
