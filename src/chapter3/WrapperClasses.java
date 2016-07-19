package chapter3;

import java.util.ArrayList;
import java.util.List;

import lib.TextElements;

@SuppressWarnings("all")
public class WrapperClasses {
	
	static TextElements tx;

	public static void main(String[] args) {

		{
			int primitive = Integer.parseInt("123");
			Integer wrapper = Integer.valueOf("123");

			// Also works
			Integer w1 = Integer.parseInt("123");

			try {
				Integer w2 = Integer.parseInt("ORACLE");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(tx.SEPARATOR);

		/*
		 * Lists Primitive then its Wrapper class
		 * 
		 * REMEBER>> Primitive: parse+PrimitiveInCamel. eg.: parseBoolean(),
		 * parseInt() Wrapper: valueOf()
		 */
		{
			System.out.println(Boolean.parseBoolean("true"));
			
			/**
			 * Boolean.parseBoolean() and Boolean.valueOf() logic:
			 * 
			 * public static boolean parseBoolean(String s) {
			 * 		return ((s != null) && s.equalsIgnoreCase("true"));
			 * }
			 */
			System.out.println(Boolean.parseBoolean("ttrue"));
			System.out.println(Boolean.valueOf("true"));

			System.out.println(Byte.parseByte("123"));
			System.out.println(Byte.valueOf("123"));
			System.out.println(Short.parseShort("123"));
			System.out.println(Short.valueOf("123"));
			System.out.println(Integer.parseInt("123"));
			System.out.println(Integer.valueOf("123"));
			System.out.println(Long.parseLong("123"));
			System.out.println(Long.valueOf("123"));
			System.out.println(Float.parseFloat("123.00"));
			System.out.println(Float.valueOf("123.03f"));
			System.out.println(Double.parseDouble("123"));
			System.out.println(Double.valueOf("123"));

		}
		
		System.out.println(tx.SEPARATOR);
		
		//Autoboxing
		{
			List<Double> weights = new ArrayList<Double>();
			weights.add(50.5);				System.out.println(weights);
			weights.add(new Double(60));	System.out.println(weights);
			weights.remove(50.5);			System.out.println(weights);
			double first = weights.get(0);	System.out.println(weights);
			
			try {
				List<Integer> heights = new ArrayList<>();
				heights.add(null);			System.out.println(weights);
				int a = heights.get(0);		System.out.println(weights);
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//Still autoboxing..
		{
			List<Integer> numbers = new ArrayList<Integer>();
			numbers.add(1);					System.out.println(numbers);
			numbers.add(2);					System.out.println(numbers);
			numbers.remove(1);				System.out.println(numbers);
			
			numbers.add(2);					System.out.println(numbers);
			numbers.remove(new Integer(1));	System.out.println(numbers);
		}
		
		

	}

}
