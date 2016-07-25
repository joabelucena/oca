package chapter5.zoo.modifiers;

import chapter5.zoo.Animal;

public class Lion extends Animal{
	private void roar(){
		setAge(3);
		
		System.out.println("The " + getAge() + " yer old lion says: ROARRR!!");
		
//		System.out.println("The " + age + " yer old lion says: ROARRR!!");		DOES NOT COMPILE: age is private
	}
	
	public static void main(String[] args) {
		Animal an = new Lion();
		
//		Lion ln = new Animal();						DOES NOT COMPILE: Don't know why yet, but I will.. kkkk
		
		
		
	}

}
