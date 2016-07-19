package chapter2;

public class TernaryOperator {

	public static void main(String[] args) {
		
		
		{
			int x = 8756;
			int y = 658;
			
			int z = (x > y ? (x > 32421 ? 123413 : 123432) : y);
			
			System.out.println(z);
				
		}
		
		{
			int x = 8756;
			byte y = 10;
			
			final int z = x > y ? x : y;
			
		}
		
	}
}
