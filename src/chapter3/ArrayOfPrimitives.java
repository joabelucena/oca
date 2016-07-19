package chapter3;

import java.util.Arrays;

import lib.TextElements;

@SuppressWarnings("all")
public class ArrayOfPrimitives {
	public static void main(String... x) {

		{
			int[] numbers1 = new int[3];
			int[] numbers2 = new int[] { 42, 55, 99 };

			for (int i : numbers2)
				System.out.println(i);
		}

		{
			int[] numbers2 = { 42, 55, 99 };
		}

		// Alternative ways to instantiate an array
		{
			int[] array1;
			int[] array2;
			int array3[];
			int array4[];
		}

		{
			int[] ids, types;
		}

		{
			int ids[], types;
		}

		System.out.println(TextElements.SEPARATOR);

		{
			String[] bugs = { "cricket", "beetle", "ladybug" };
			String[] bugs1 = { "cricket", "beetle", "ladybug" };

			String alias[] = bugs;

			System.out.println(bugs.equals(alias));
			System.out.println(bugs.equals(bugs1));

			System.out.println(bugs.toString());
			System.out.println(bugs1.toString());

			System.out.println(Arrays.toString(bugs));
		}

		System.out.println(TextElements.SEPARATOR);

		{
			String[] str = { "stringValue" };
			Object[] obj = str;
			String[] againStrings = (String[]) obj;
			// againStrings[0] = new StringBuilder();
			//obj[0] = new StringBuilder();

			try {
				System.out.println(Arrays.toString(obj)); // throws an exception
															// because its an
															// Object array but
															// has a
															// StringBuilder
															// object
			} catch (Exception e) {

			}
		}

		System.out.println(TextElements.SEPARATOR);

		{
			int[] numbers = { 6, 9, 1 };
			Arrays.sort(numbers);
			for (int i : numbers)
				System.out.print(i + " ");
		}
		
		System.out.println(TextElements.SEPARATOR);

		//sort()
		{
			String[] strings = { "10", "9", "100" };
			Arrays.sort(strings);
			for (String str : strings)
				System.out.print(str + " ");
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//binarySearch()
		{
			int[] numbers = {2,4,6,8};
			
			System.out.println(Arrays.binarySearch(numbers, 2));	//3
			System.out.println(Arrays.binarySearch(numbers, 4));	//4
			System.out.println(Arrays.binarySearch(numbers, 1));	//5
			System.out.println(Arrays.binarySearch(numbers, 3));	//6
			System.out.println(Arrays.binarySearch(numbers, 9));	//7
			
		}

	}
}
