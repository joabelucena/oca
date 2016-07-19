package chapter3;

import lib.TextElements;

@SuppressWarnings("all")
public class StringBuilderClass {

	public static void main(String[] args) {
		
		/*
		 * Alphabet with String class creates a new object on each iteration.
		 * When alpha += current is evaluated, Java creates a new object and
		 * the old alpha value becomes eligible for garbage collecion.
		 */
		{
			String alpha = "";
			for(char current = 'a'; current <= 'z'; current++)
				alpha += current;
			System.out.println(alpha.toUpperCase());
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		/*
		 * As StringBuilder class is not immutable, it can holds the object and
		 * change its value through the iterations so, no new object is created.
		 */
		{
			StringBuilder alpha = new StringBuilder();
			for(char current = 'a'; current <= 'z'; current++)
				alpha.append(current);
			System.out.println(alpha.toString().toUpperCase());
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		/*
		 * Remember, StringBuilder class is mutable...
		 */
		{
			StringBuilder sb = new StringBuilder("start");
			sb.append("+middle");
			StringBuilder same = sb.append("+end");
			
			System.out.println(sb);
			System.out.println(same);
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			StringBuilder sb1 = new StringBuilder();			//Creates a empty StringBuilder
			StringBuilder sb2 = new StringBuilder("Oracle");	//Creates a StringBuilder and assign "Oracle" on it
			StringBuilder sb3 = new StringBuilder(10);			//Creates StringBuilder containing 10 empty spaces
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			StringBuilder sb = new StringBuilder();
			
			System.out.println(sb.capacity());
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//append()
		{
			StringBuilder sb = new StringBuilder().append(1).append('c');
			sb.append("-").append(true);
			System.out.println(sb);
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//insert()
		{
			/* 
			 * 012345
			 * Oracle						
			 */
			System.out.println("012345");
			System.out.println("Oracle");
			System.out.println(TextElements.MINISEPARATOR);
			System.out.println("0 - " + new StringBuilder("Oracle").insert(0, "AAA"));
			System.out.println("3 - " + new StringBuilder("Oracle").insert(3, "AAA"));
			
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//delete()
		{
			System.out.println(new StringBuilder("Oracle").delete(0, 2));
			System.out.println(new StringBuilder("Oracle").deleteCharAt(4));
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//reverse() +  toString()
		{
			System.out.println(new StringBuilder("Oracle").reverse().toString().toUpperCase());
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		System.out.println(TextElements.SEPARATOR);
		System.out.println(TextElements.SEPARATOR);
		System.out.println(TextElements.SEPARATOR);
		System.out.println(TextElements.SEPARATOR);
		System.out.println(TextElements.SEPARATOR);
	}

}
