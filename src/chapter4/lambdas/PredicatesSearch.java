package chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatesSearch {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();

		// animal , hopper, swimmer
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
		
		animals.removeIf(s->s.toString().equalsIgnoreCase("fish"));
		
		print(animals, a->a.canSwim());
		
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}

}
