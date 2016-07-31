package enthuware;

import static lib.TextElements.*;

public class Test2 {

	static int j;

	public static void main(String[] args) {

		{
//			int c = 0;
//			JACK: while (c < 8) {
//				JILL: System.out.println(c);
//				if (c > 3) 
//					break JILL;			//DOES NOT COMPILE
//				else
//					c++;
//			}
		}

		separe();

		{
			while (j <= 5) {
				for (int j = 1; j <= 5;) {
					System.out.print(j + " ");
					j++;
				}
				j++;
			}
			System.out.println();
		}

		separe();

		{
			int i = 0;
			int[] iA = { 10, 20 };
			iA[i] = i = 30;
			System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
			
		}
		
		separe();
		
		{
			int x = 0;
			
//			while (false) { x=3; }
			
			if (false) { x=3; }
			do{ x = 3; } while(false);
			for( int i = 0; i< 0; i++) x = 3;
		}
		
		separe();
		
		{
			float f = -123;
			float d = 1.5f;
			System.out.println(f);
		}
		
		separe();
		
		//Redeclaring variables
		{
			int j;
			
		}

	}
	
	float parseFloat(String s){
		float f = 0.0f;      // 1
	     try{
	          f = Float.valueOf( s ).floatValue();    // 2
	          return f ;      // 3
	     }
	     catch(NumberFormatException nfe){
	        f = Float.NaN ;    // 4
	       return f;     // 5
	     }
	     finally {
	         return f;     // 6
	     }
//	     return f ;    // 7
	}
}
