package chapter3;

import lib.TextElements;

@SuppressWarnings("all")
public class StringClass {

	public static void main(String[] args) {

		{
			
			{String name = "Fluffy";}
			{String name = new String("Fluffy");}

		}

		System.out.println(TextElements.SEPARATOR);

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

		System.out.println(TextElements.SEPARATOR);

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
		
		System.out.println(TextElements.SEPARATOR);
		
		//String Common methods
		{
			
			//                   012345
			final String test = "Oracle";
			
			//Returns String size
			System.out.println(test.length());
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//Returns the char at the passed index
			System.out.println(test.charAt(0));
			System.out.println(test.charAt(1));
			System.out.println(test.charAt(2));
			System.out.println(test.charAt(3));
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//IndexOf
			System.out.println(test.indexOf('a'));
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//'char, fromIndex
			System.out.println(test.indexOf('a',test.indexOf('a')+1));
			System.out.println(test.indexOf("acle"));
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//Substring
			System.out.println(test.substring(3));
			System.out.println(test.substring(2));
			
			System.out.println(test.substring(2,4));
			System.out.println(test.substring(test.indexOf('r'),test.indexOf('e')));
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//toUpperCase() and toLowerCase()
			System.out.println(test.toUpperCase());
			System.out.println(test.toLowerCase());
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//equals() and equalsIgnoreCase()
			System.out.println("abc".equals("ABC"));
			System.out.println("ABC".equals("ABC"));
			System.out.println("abc".equalsIgnoreCase("AbC"));
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//startsWith() and endsWith()
			System.out.println(test.startsWith("o"));	//false
			System.out.println(test.startsWith("O"));	//true
			System.out.println(test.endsWith("e"));		//true
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//contains()
			System.out.println(test.contains("o"));		//false
			System.out.println(test.contains("O"));		//true
			System.out.println(test.contains("e"));		//true
			System.out.println(test.contains("cle"));	//true
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//replace()
			System.out.println(test.replace('a', 'b'));
			System.out.println(test.replace("f", "g"));
			System.out.println(test.replace("acl", "JAVA"));
			
			System.out.println(TextElements.MINISEPARATOR);
			
			//trim()
			System.out.println(("\t" + test + "   " + "aa").trim());
				
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			String result = "AniMaL        ".trim().toLowerCase().replace("a", "A");
			System.out.println(result);
		}
		
	}

}
