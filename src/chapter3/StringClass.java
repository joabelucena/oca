package chapter3;

import static lib.TextElements.*;

@SuppressWarnings("all")
public class StringClass {

	public static void main(String[] args) {

		{
			
			{String name = "Fluffy";}
			{String name = new String("Fluffy");}

		}

		separe();

		// Concatenation
		{
			System.out.println(1 + 2);
			System.out.println("a" + "b");
			System.out.println("a" + "b" + 3);
			System.out.println(1 + 2 + "c");
			System.out.println("a" + 2 + "c");
		}

		{
			String s = "1";
			s += "2";
			s += 3;

			System.out.println(s);
		}

		separe();

		{

			String s1 = "1";

			// Although it returns a concatenated String, this doesn't change
			// the s1 value at all
			s1.concat("2");
			s1.concat("3");

			// Number '1' is printed
			System.out.println(s1);

			// Here is printed '12' because concat() returns the concatenated
			// String.
			System.out.println(s1.concat("2"));
		}
		
		separe();
		
		//String Common methods
		{
			
			//                   012345
			final String test = "Oracle";
			
			//Returns String size
			System.out.println(test.length());
			
			miniSepare();
			
			//Returns the char at the passed index
			System.out.println(test.charAt(0));
			System.out.println(test.charAt(1));
			System.out.println(test.charAt(2));
			System.out.println(test.charAt(3));
			
			miniSepare();
			
			//IndexOf
			System.out.println(test.indexOf('a'));
			
			miniSepare();
			
			//'char, fromIndex
			System.out.println(test.indexOf('a',test.indexOf('a')+1));
			System.out.println(test.indexOf("acle"));
			
			miniSepare();
			
			//Substring
			System.out.println(test.substring(3));
			System.out.println(test.substring(2));
			
			System.out.println(test.substring(2,4));
			System.out.println(test.substring(test.indexOf('r'),test.indexOf('e')));
			
			miniSepare();
			
			//toUpperCase() and toLowerCase()
			System.out.println(test.toUpperCase());
			System.out.println(test.toLowerCase());
			
			miniSepare();
			
			//equals() and equalsIgnoreCase()
			System.out.println("abc".equals("ABC"));
			System.out.println("ABC".equals("ABC"));
			System.out.println("abc".equalsIgnoreCase("AbC"));
			
			miniSepare();
			
			//startsWith() and endsWith()
			System.out.println(test.startsWith("o"));	//false
			System.out.println(test.startsWith("O"));	//true
			System.out.println(test.endsWith("e"));		//true
			
			miniSepare();
			
			//contains()
			System.out.println(test.contains("o"));		//false
			System.out.println(test.contains("O"));		//true
			System.out.println(test.contains("e"));		//true
			System.out.println(test.contains("cle"));	//true
			
			miniSepare();
			
			//replace()
			System.out.println(test.replace('a', 'b'));
			System.out.println(test.replace("f", "g"));
			System.out.println(test.replace("acl", "JAVA"));
			
			miniSepare();
			
			//trim()
			System.out.println(("\t" + test + "   " + "aa").trim());
				
		}
		
		separe();
		
		{
			String result = "AniMaL        ".trim().toLowerCase().replace("a", "A");
			System.out.println(result);
		}
		
	}

}
