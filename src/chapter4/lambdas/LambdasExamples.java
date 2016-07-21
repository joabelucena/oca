package chapter4.lambdas;

import java.util.function.Predicate;

public class LambdasExamples {

	public static void main(String[] args) {
		
		/*
		 * valid lambda Sintax for interfaces:
		 *
		 * interface Interface1{ boolean teste(); }
		 * 
		 * interface Interface2{ boolean teste(String a); }
		 * 
		 * interface Interface3{ boolean teste(String b); }
		 */
		
		/*
		 * No parameter
		 */
		doLambda(()->true);
		
		/*
		 * Single parameter
		 */
		//Nothing
		doLambda(a -> a.startsWith("test"));
		//Parentheses
		doLambda((String a) -> a.startsWith("test"));
		//Braces
		doLambda(a -> {return a.startsWith("test"); });
		//Parentheses + Braces
		doLambda((String a) -> {return a.startsWith("test");});
		
		
		/*
		 * Twice or more parametes
		 */
		//Parentheses (required)
		doLambda((a,b) -> a.startsWith("test"));
		//Parentheses + Type
		doLambda((String a, String b) -> a.startsWith("test"));
		//Parentheses + Type + braces
		doLambda((String a, String b) -> {return a.startsWith("test");});
		
		System.out.println("Add: " + calc(2, 3, (a, b) -> a + b));
		
		System.out.println("Subtract: " + calc(2, 3, (a, b) -> a - b));
		
		System.out.println("Modulus: " + calc(2, 5, (a, b) -> a % b));
		
	}

	
	private static void doLambda(Interface1 i) {
		System.out.println("Interface1");
	}

	private static void doLambda( Interface2 i) {
		System.out.println("Interface2");
	}

	private static void doLambda( Interface3 i) {
		System.out.println("Interface3 " + i.teste("test", "b"));
	}
	
	private static int calc(int a, int b, Math c){
		return c.calc(a, b);
	}

}
