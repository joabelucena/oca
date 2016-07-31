package chapter4;

import static lib.TextElements.*;

public class OverloadedMethods {
	public static void main(String[] args) {
		fly(0);					//if an int method is provided, Java will not autobox the parameters.
		fly((short)  0);
		fly((Integer)  0);
		
//		test(1214);				//DOES NOT COMPILE: Can't autocast from int to byte.
		
		test((byte) 1214);
		
		separe();
		
		System.out.print(glide("a"));
		System.out.print(glide("a", "b"));
		System.out.print(glide("a", "b", "c"));
		
		separe();
		
//		play(4);				//DOES NOT COMPILE: The autobox (from int to long) is made on compile time. Since Java doesn't find any play(long l) method, it doesn't compile
		play(4L);
		
	}
	
	
	/*
	 * Basic overloading
	 */
	public static void fly(int numMiles){ System.out.println("int"); }
	
	public static void fly(short numFeet){ System.out.println("short"); }
	
	public boolean fly(){return false;}
	
//	public static boolean fly() throws Exception {return false;}		//DOES NOT COMPILE: Overloaded methods must have a different parameter's list
	
	void fly(int numMiles, short numFeet){}
	
	public void fly(short numFeet, int numMiles) throws Exception {}
	
	/*
	 * Overloading and Varargs
	 */
	public static void fly(int[] lengths){}
//	public static void fly(int...lengths){}								//DOES NOT COMPILE: Java treats varargs as the same as arrays
	
	/*
	 * Overloading and Autoboxing
	 */
	public static void fly(Integer numMiles){ System.out.println("Integer"); }
	
	/*
	 * Primitives
	 */
	public static void test(byte n){ System.out.println("byte " + n); }
	
	/*
	 * Overloading precedence (the glide example)
	 */
	public static String glide(String s)	{return "1"; }
	public static String glide(String...s)	{return "2"; }
	public static String glide(Object o) 	{return "3"; }
	public static String glide(String s, String t)	{return "4"; }
	
	/*
	 * Too many conversions
	 */
	public static void play(Long l){ }
	public static void play(Long... l){ }
}
