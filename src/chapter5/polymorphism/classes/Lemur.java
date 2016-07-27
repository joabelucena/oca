package chapter5.polymorphism.classes;

import chapter5.polymorphism.interfaces.HasTail;

public class Lemur extends Primate implements HasTail {
	
	@Override
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		
		/*
		 * DOES NOT COMPILE ZONE
		 */
		// DOES NOT COMPILE: Since 'age' is not a member from HasTail interface, it is not reachable
		System.out.println(hasTail.age);
		
		// DOES NOT COMPILE: isTailStriped() is a member of HasTail and 'primate' is a 'Lemur' object but in a 'Primate' reference
		System.out.println(primate.isTailStriped());
		
	}

}
