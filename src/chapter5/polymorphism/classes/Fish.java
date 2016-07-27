package chapter5.polymorphism.classes;

public class Fish {
	public static void main(String...args){
		Fish fish = new Fish();
		
		/*
		 * DOES NOT COMPILE: Cast from not related (doesn't have neither inheritance
		 * nor implementation) classes are not allowed
		 */
		Bird bird = (Bird) fish;
	}
}
