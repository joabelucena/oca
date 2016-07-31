import lib.Car;
import static lib.TextElements.*;
import chapter5.modifiers.z.Z;

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

		separe();
		
		{
			int m = 9, n = 1, x = 0;
			while(m > n){
				m--;
				n += 2;
				x += m + n;
			}
			System.out.println(x);
		}
		
		separe();
		
		{
			StringBuilder a = new StringBuilder("a");
			StringBuilder b = a;
			
			a.append("b");
			
			System.out.println(a);
			System.out.println(b);
		}
		
		separe();
		
		{
			Car car = new Car();
			
//			car.test;			//DOES NOT COMPILE: trying to access a static variable, but a package-private one
		}
		
		separe();
		
		{
			Kangaroo joey = new Kangaroo();
			joey.getMarsupialDescription();
		}
		
		separe();
		
		{
			Z z = new Z();
			z.getPublicX();
			z.getPublicY();
			z.getPublicZ();
		}

	}

	protected void finalize() {
		System.out.println("Finalizing");
	}
}
