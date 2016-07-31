package chapter4.specifiers.statics.finals;

import java.util.ArrayList;

import static lib.TextElements.*;

public class Initializers {
	
	public static int static1;
	public static int static2 = 0;
	
	public static final int final1;
	public static final int final2 = 0;
//	public static final int final3;								//DOES NOT COMPILE: final variable never becomes initialized
	
	public int instance1;
	public int instance2 = 0;
	
	public static final ArrayList<String> values = new ArrayList<String>();
	
	/* 
	 * Precedence: 3
	 * 
	 * Constructor
	 */
	public Initializers(){
		
		separe();
		System.out.println("Constructor");
		miniSepare();
		
		static1 = 3;
		static2 = 3;
//		final1 = 2;												//DOES NOT COMPILE
//		final2 = 2;												//DOES NOT COMPILE
		instance1 = 3;
		instance2 = 3;
		
		System.out.println("static1: " + static1);
		System.out.println("static2: " + static2);
		System.out.println("final1: " + final1);
		System.out.println("final2: " + final2);
		System.out.println("instance1: " + instance1);
		System.out.println("instance2: " + instance2);
		
		separe();
		
	}
	
	/* 
	 * Precedence: 2
	 * 
	 * Instance initializer. Only instance variables are allowed to stay here
	 */
	{
		separe();
		System.out.println("Instance initializer");
		miniSepare();
		
		static1 = 2;
		static2 = 2;
//		final1 = 2;												//DOES NOT COMPILE
//		final2 = 2;												//DOES NOT COMPILE
		instance1 = 2;
		instance2 = 2;
		
		System.out.println("static1: " + static1);
		System.out.println("static2: " + static2);
		System.out.println("final1: " + final1);
		System.out.println("final2: " + final2);
		System.out.println("instance1: " + instance1);
		System.out.println("instance2: " + instance2);
		
		separe();
		
	}
	
	/* 
	 * Precedence: 1
	 * 
	 * Static initializer. Only static variables are allowed to stay here
	 * 
	 * Final variables that have already been initialized, can't be assigned again here 
	 */
	static {
		
		separe();
		System.out.println("Static initializer");
		miniSepare();
		
		static1 = 1;
		static2 = 1;
		final1 = 1;
//		final2 = 1;												//DOES NOT COMPILE
		
		
		System.out.println("static1: " + static1);
		System.out.println("static2: " + static2);
		System.out.println("final1: " + final1);
		System.out.println("final2: " + final2);
//		System.out.println("instance1: " + instance1);			//DOES NOT COMPILE
//		System.out.println("instance2: " + instance2);			//DOES NOT COMPILE
		
		separe();
	}
	
	
	public static void main(String[] args) {
		
		
		Initializers in = new Initializers();
		
		/*
		 * We're allowed to use static reference's methods
		 */
		values.add("changed");
		System.out.println(values);

	}

}
