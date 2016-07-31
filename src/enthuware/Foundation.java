package enthuware;
import lib.TextElements;

public class Foundation {

	public static void main(String... args) {

		// Bitwise operators
		{
			int a = 4;
			int b = 3;

			int A = 0b100;
			int B = 0b011;

			System.out.println(A);
			System.out.println(B);

			System.out.println(a | b);
		}

		System.out.println(TextElements.SEPARATOR);

		// Switches: larger --> smaller
		{
			// Exercises
			final int i = 10;
			final byte b = 10;
			final char c = 191;
			final short s = 12;
			final char nC = (char) -2;

			switch (i) {
			case b:
				System.out.println("byte");
				break;
			case c:
				System.out.println("char");
				break;
			case s:
				System.out.println("short");
				break;
			default:
				break;
			}

		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			switch (1) {
			}
		}
	}
}
