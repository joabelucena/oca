import lib.TextElements;

public class TestClass {

	public static void main(String[] args) {
		{
			int count = 0;
			ROW_LOOP: for (int row = 1; row <= 3; row++)
				for (int col = 1; col <= 2; col++) {
					if (row * col % 2 == 0)
						continue ROW_LOOP;
					count++;
				}
			System.out.println(count);
		}

		System.out.println(TextElements.SEPARATOR);
		
		{
			int m = 9, n = 1, x = 0;
			while(m > n){
				m--;
				n += 2;
				x += m + n;
			}
			System.out.println(x);
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			StringBuilder a = new StringBuilder("a");
			StringBuilder b = a;
			
			a.append("b");
			
			System.out.println(a);
			System.out.println(b);
		}

	}

	protected void finalize() {
		System.out.println("Finalizing");
	}
}
