package chapter4.specifiers.statics;

import static lib.TextElements.*;
import chapter4.specifiers.statics.Koala;

public class KoalaTester extends TextElements {
	
	public static void main(String[] args) {
		Koala.main(new String[0]);
		
		{
			Koala k = new Koala();
			System.out.println(k.count);
			k = null;
			System.out.println(k.count);
		}
		
		System.out.println(SEPARATOR);
		
		{
			Koala.count = 4;
			Koala koala1 = new Koala();
			Koala koala2 = new Koala();
			koala1.count = 6;
			koala2.count = 5;
			System.out.println(Koala.count);
			
		}
	}
}