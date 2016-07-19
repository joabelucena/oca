package chapter2;

public class DataTypes {
	
	public static void main(String...args){
		
		//Numeric Promotion
		{
			
			/*
			 * 1. Two different data types 		-> Returns the larger one
			 * 2. integral vs floating point	-> Returns the floating point
			 * 3. byte, short, char				-> Returns int
			 * 
			 * This happens when having binary arithmetic operators
			 * 
			 */
			
			byte x = 120;
			byte y = 120;
			
			byte z = (byte) (x + y);
			
			//byte a = x + y;	//e:cannot convert from int to byte;;
			
			System.out.println(z);
		}
		
		{
			float x = 1.9f;
			float y = (float) 2.0;
			
			float z = x + y;			
		}
		
		{
			float x = 1.9f;
			float y = (float) 2.0;
			
			float z = x + y;			
		}
		
		{
			char x = 'a';
			char y = 'b';
			
			int z = x + y;
			
			System.out.println("char x: " + x);
			System.out.println("char y: " + y);
			System.out.println("char z: " + z);
		}
		
		{
			float x = 1.8f;
			long y = Integer.MAX_VALUE;
			
			float z = x + y;
			
			System.out.println(z);
		}
		
		
		{
			byte a = 40, b = 50;
			byte sum = (byte) (a + b);
			
			System.out.println(sum);
		}
	}
}
