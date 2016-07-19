package chapter2;

import chapter1.tmp.packagea.ClassA;

public class EqualtyOperators {

	public static void main(String[] args) {
		ClassA a = new ClassA();
		ClassA b = new ClassA();
		ClassA c = a;
		
		System.out.println(b == a);
		System.out.println(b == c);
		
		Integer i1 = 5;
		Integer i2 = 5;
		Integer i3 = i1;
		
		System.out.println(i1 == i2);
		System.out.println(i2 == i3);

	}

}
