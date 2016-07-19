package chapter2;

public class LogicalOperators {

	public static void main(String[] args) {
		String a = "aa";
		String b;
		
		
		boolean x = (true || b.length() > 5);
		
		System.out.println(x);
		
		int xA = 6;
		boolean y = (xA >= 6) || (++xA <= 7);
		System.out.println(xA);	//As xA >= 6 is true, the incrementor is never called
		
		//Ternary Operator
		int yA = 10;
		int yB = (yA > 10) ? (yA * 2) : (yA * 3);
		
		int i1 = 1;
		int i2 = 1;
		final int i3 = i1 > 2 ? i1++ : i2++;
		
		/**
		 * Prints 1, 2 because once the boolean expression evalua3w2wtes to true, the 'else' side is never called.
		 */
		System.out.println(i1+", "+i2);
		
		
		System.out.println(yB);
		
	}

}
