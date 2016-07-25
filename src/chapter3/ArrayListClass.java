package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lib.TextElements;

@SuppressWarnings({"unused", "all"})
public class ArrayListClass {
	
	protected String hello = "Hello";		//Static protected variable for used as example of inheritance on chapter5
	
	static TextElements tx;

	public static void main(String[] args) {
		
		//ArrayList declarations
		{
			//Basic construction
			ArrayList list1 = new ArrayList();
			ArrayList list2 = new ArrayList(10);
			ArrayList list3 = new ArrayList(list2);
			
			//Specifying types
			ArrayList<String> list4 = new ArrayList<String>();
			ArrayList<String> list5 = new ArrayList<>();
		}
		
		System.out.println(tx.SEPARATOR);
		
		{
			List<String> list6 = new ArrayList<>(3);
//			ArrayList<String> list7 = new List<>();		//DOES NOT COMPILE
			
			list6.add("a");
			list6.add("b");
			list6.add("c");
			
			list6.add("d");
		}
		
		System.out.println(tx.SEPARATOR);
		
		//ArrayList useful methods
		{
			/*
			 * methods: add()
			 * assignment(s):
			 * 
			 *  boolean add(E element)
			 *  void add(int index, E element)
			 */
			{
				ArrayList list = new ArrayList();
				list.add("hawk");
				list.add(true);
				list.add('c');
				System.out.println(list);
				
				
				ArrayList<String> safer = new ArrayList();
				safer.add("hawk");
//				safer.add(true);						//DOES NOT COMPILE
				
				List<String> birds = new ArrayList<String>();
				birds.add("hawk"); 				System.out.println(birds);	//hawk
				birds.add(1, "robin");			System.out.println(birds);	//hawk, robin
				birds.add(0, "blue jay");		System.out.println(birds);	//blue jay, hawk, robin
				birds.add(1, "cardinal");		System.out.println(birds);	//blue jay, cardinal, hawk, robin
				
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			/*
			 * method: remove()
			 * assignment(s):
			 * 
			 * boolean remove(Object obj)
			 * E remove(int index)
			 */
			{
				List<String> birds = new ArrayList<String>();
				birds.add("hawk"); 				System.out.println(birds);	//hawk
				birds.add("hawk"); 				System.out.println(birds);	//hawk
				
				System.out.println(birds.remove("cardinal"));
				System.out.println(birds.remove("hawk"));
				System.out.println(birds.remove(0));
				System.out.println(birds);
				
				try {
					System.out.println(birds.remove(100));	//Throws exception
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			/*
			 * method: set()
			 * assignment(s):
			 * 
			 * E set(int index, E newElement)
			 */
			{
				List<String> birds = new ArrayList<String>();
				birds.add("hawk"); 				System.out.println(birds);	//hawk
				System.out.println(birds.size());
				birds.set(0, "robin");
				System.out.println(birds.size());
				
				
				try {
					birds.set(1, "robin");	//Throws exception
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			/*
			 * method(s): isEmpty() and size()
			 * assignment(s):
			 * 
			 * boolean isEmpty()
			 * boolean size()
			 */
			{
				List<String> birds = new ArrayList<String>();
				
				
				System.out.println(birds.isEmpty());			//true
				System.out.println(birds.size());				//0
				birds.add("hawk");
				System.out.println(birds.isEmpty());			//false
				System.out.println(birds.size());				//1
				
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			/*
			 * method(s): clear()
			 * assignment(s):
			 * 
			 * void clear()
			 */
			{
				List<String> birds = new ArrayList<String>();
				
				
				System.out.println(birds.isEmpty());			//true
				System.out.println(birds.size());				//0
				birds.add("hawk");
				birds.add("robin");
				
				System.out.println(birds.isEmpty());			//false
				System.out.println(birds.size());				//1
				
				birds.clear();
				
				System.out.println(birds.isEmpty());			//false
				System.out.println(birds.size());				//1	
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			/*
			 * method(s): contains()
			 * assignment(s):
			 * 
			 * boolean contains(Object obj)
			 */
			{
				List<String> birds = new ArrayList<String>();
				
				birds.add("hawk");
				
				System.out.println(birds.contains("hawk"));
				System.out.println(birds.contains("robin"));
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			/*
			 * method(s): equals()
			 * assignment(s):
			 * 
			 * boolean equals(Object obj)
			 */
			{
				List<String> one = new ArrayList<String>();
				List<String> two = new ArrayList<String>();
				
				System.out.println("one:" + one + "\t\t| two:" + two + ": " + one.equals(two));
				one.add("a");
				System.out.println("one:" + one + "\t\t| two:" + two + ": " + one.equals(two));
				two.add("a");
				System.out.println("one:" + one + "\t\t| two:" + two + ": " + one.equals(two));
				one.add("b");
				System.out.println("one:" + one + "\t| two:" + two + ": " + one.equals(two));
				two.add(0, "b");
				System.out.println("one:" + one + "\t| two:" + two + ": " + one.equals(two));
						
			}
			
		}
		
		System.out.println(tx.SEPARATOR);
		
		//Converting ArrayList <--> array [primitive]
		{
			
			//List --> array
			{
				List<String> list = new ArrayList<String>();
				
				list.add("hawk");
				list.add("robin");
				
				Object[] objectArray = list.toArray();
				System.out.println(objectArray.length);
				
				
				String[] str1 = list.toArray(new String[99]);
				System.out.println(str1.length);
				
				System.out.println(str1[0]);
				System.out.println(str1[1]);
				System.out.println(str1[2]);
				
				System.out.println(tx.MINISEPARATOR);
				
				//[0] creates a array with proper length
				String[] str2 = list.toArray(new String[0]);
				System.out.println(str2.length);
				
				System.out.println(str2[0]);
				System.out.println(str2[1]);	
			}
			
			System.out.println(tx.MINISEPARATOR);
			
			//array --> List
			{
				
				/*
				 * After convertion, both will point to the same objects. Be careful.
				 */
				
				String[] array = {"hawk", "robin" };
				List<String> list = Arrays.asList(array);
				
				System.out.println(list.size());
				
				list.set(1, "test");
				array[0] = "new";
				
				for(String b : array) System.out.print(b + " ");
				
				try {
					list.remove(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				try {
					list.add("ss");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
		}

	}

}
