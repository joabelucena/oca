package chapter4.specifiers.statics;

import chapter4.specifiers.statics.finals.Initializers;

public class Counter {
	private static int count;
	public Counter() { count++; }
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		System.out.println(count);
		
		System.out.println(Initializers.final1);

	}

}
