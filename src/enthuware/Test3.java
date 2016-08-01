package enthuware;

import static lib.TextElements.separe;
import static java.lang.System.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

abstract class Automobile{
	abstract void honk();   //(3)
}

class Hidden{
	public void m1(){}
	public static void m2(){}
}

public class Test3 extends Hidden {
	
	public void m1(){}
	
	public static void m2(){}
	
	//DOES NOT COMPILIE
//	public static void m1(){}
//	
//	public void m2(){}

	public static void main(String[] args) {
		{
			System.out.println(args.length);
			
			System.out.println(args == null);
			
			StringBuilder sb = new StringBuilder();
		}
		
		separe();
		
		{
			for (int i = 0; i < 10; i++) System.out.print(i + " ");  //1
			for (int i = 10; i > 0; i--) System.out.print(i + " ");  //2
			int i = 20;                  //3
			System.out.println(i + " ");   //4
		}
		
		separe();
		
		{
			char a = 1;
			
//			Double d = 111;
			double d1 = 111;
			
//			Long l = 111;
			long l1 = 111;
//			long l2 = 111.0;
		}
		
		separe();
		
		{
			ArrayList<Double> al = new ArrayList<>();
			
			al.contains("string");
			
			String String = "string isa string";
			System.out.println(String.substring(3, 6));
			System.out.println(String.class);
			out.println("static import");
			
			
			
			System.out.println(LocalDateTime.now());
			
		}

	}

}
