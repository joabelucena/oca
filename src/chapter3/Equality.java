package chapter3;

import lib.Car;
import static lib.TextElements.*;

@SuppressWarnings("all")
public class Equality {

	public static void main(String[] args) {
		
		{
			StringBuilder one = new StringBuilder();
			StringBuilder two = new StringBuilder();
			StringBuilder three = one.append("a");
			
			System.out.println(one == two);
			System.out.println(one == three);
		}
		
		separe();
		
		/*
		 * Compiled-time is different than run-time Strings
		 */
		{
			String x = "Hello World";
			String y = "Hello World";
			
			String z = " Hello World".trim();
			
			System.out.println(x == y);		//true
			System.out.println(x == z);		//false
			
		}
		
		separe();
		
		{
			String x = new String("Hello World");	//This one stays at regular objects memory, eg.: new Car(), new String(), new ArrayList(), ...
			String y = "Hello World";				//This one stays at String Pool memory, a memory reserved for literals, eg.: "abc", "123", etc
			
			System.out.println(x == y);
		}
		
		separe();
		
		{
			String x = "Hello World";
			String z = " Hello World".trim();

			System.out.println(x.equals(z));
		}
		
		separe();
		
		{
			Car c1 = new Car();
			Car c2 = new Car();
			Car c3 = c1;
			
			System.out.println(c1 == c1);		//true: both points to the same object
			System.out.println(c1 == c2);		//false: points to different objects
			System.out.println(c1.equals(c2));	//false: Car doesn't implement equals() method, so Java compares if they point to the same object just like == does.
			System.out.println(c3 == c1);		//true: They point to the same object
			System.out.println(c3.equals(c1));	//true: They point to the same object, (compared by == operator)
		}

	}

}
