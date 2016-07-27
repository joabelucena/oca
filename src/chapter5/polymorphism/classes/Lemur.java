package chapter5.polymorphism.classes;

import lib.TextElements;
import chapter5.polymorphism.interfaces.HasTail;

public class Lemur extends Primate implements HasTail {
	
	@Override
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		
		Lemur lemur = new Lemur();
		
		//Pollymorphism
		{
			System.out.println(lemur.age);
			HasTail hasTail = lemur;
			System.out.println(hasTail.isTailStriped());
			Primate primate = lemur;
			System.out.println(primate.hasHair());
			
			// DOES NOT COMPILE: Since 'age' is not a member from HasTail interface, it is not reachable
			System.out.println(hasTail.age);
			
			// DOES NOT COMPILE: isTailStriped() is a member of HasTail and 'primate' is a 'Lemur' object but in a 'Primate' reference
			System.out.println(primate.isTailStriped());	
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//Casting objects
		{
			Primate primate = lemur;
			Lemur lemur2 = primate;		//DOES NOT COMPILE: 
			Lemur lemur3 = (Lemur) primate;
			System.out.println(lemur3.age);
		}
		
		
	}

}
