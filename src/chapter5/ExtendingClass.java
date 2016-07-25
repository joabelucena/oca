package chapter5;

import chapter3.ArrayListClass;

/*
 * Extending classes will allow the class who is extending to use public and protected members from the
 * extended class.
 * 
 * The elements are:
 * 
 * Element		Description
 * **************************************
 * private		Can be accessed from within the same class.
 * no-modifier	Can be accessed from classes within the same package
 * protected	Can be accessed from classes within the same package OR sub-classes
 * public		Can be accessed from anywhere
 * 
 */
public final class ExtendingClass extends ArrayListClass {
	
	String getHello(){
		return hello;
	}
	
	public static void main(String...args){
		System.out.println(new ExtendingClass().getHello());
	}
}
