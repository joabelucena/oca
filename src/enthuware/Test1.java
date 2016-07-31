package enthuware;

import java.util.ArrayList;
import java.util.List;

import lib.TextElements;


class A {int i = 10; int m1() { return i; }}
class B extends A {int i = 20; int m1() {return i; }}
class C extends B {int i = 30; int m1() {return i; }}

public abstract class Test1 {
	public static void main(String args[]) throws Exception {
		
		//Overriding vs Hiding..
		{
			A o1 = new C();
			B o2 = (B) o1;
			
			System.out.println(o1.m1());	// 30 from C
			System.out.println(o2.i); 		// 20 from B
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		//Wrapper Classes
		{
			/*
			 * Long(long l)
			 * Long(String s)
			 */
			Long l1 = new Long(123);
			Long l2 = new Long("123");
			
			/*
			 * long valueOf(long l)
			 * long valueOf(String s)
			 */
			Long l3 = Long.valueOf(123);
			Long l4 = Long.valueOf("123");
			
			/*
			 * long parseLong(String s)
			 */
			Long l5 = Long.parseLong("123");
			
			/*
			 * Conversion methods
			 * 
			 * byte byteValue()
			 * short shortValue()
			 * int intValue()
			 * long longValue()
			 * float floatValue()
			 * double doubleValue()
			 * 
			 */
			byte 	b = l5.byteValue();
			short	s = l5.shortValue();
			int		i = l5.intValue();
			long	l = l5.longValue();
			float	f = l5.floatValue();
			double	d = l5.doubleValue();
			
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		
		//Testing equality
		{
			
			byte 	b = 123;
			short	s = 123;
			int		i = 123;
			long	l = 123L;
			float	f = 123.0f;
			double	d = 123.0;
			
			Byte 	bw = new Byte("123");
			Byte 	bd = new Byte("123");
			Short	sw = new Short("123");
			Short	sd = new Short("123");
			Integer	iw = new Integer("123");
			Integer	id = new Integer("123");
			Long	lw = new Long("123");
			Long	ld = new Long("123");
			Float	fw = new Float("123");
			Float	fd = new Float("123");
			Double	dw = new Double("123");
			Double	dd = new Double("123");
			
			/*
			 * Comparisons considering both values are the same:
			 * 
			 * Left Side	Oper		Right Side	type	Evaluation
			 * ---------------------------------------------------------
			 * Primitive	==			Primitive	diff	true
			 * Primitive	==			Wrapper		diff	true
			 * 
			 * Wrapper		==			Wrapper		diff	Will not Compile
			 * Wrapper		==			Wrapper		same	false (two different objects with same value)
			 * Wrapper		equals()	Wrapper		diff	false
			 * Wrapper		equals()	Wrapper		same	true
			 * 
			 */
			
			if(b==s) System.out.println("b==s");	// true
			if(l==b) System.out.println("l==b");	// true
			if(f==b) System.out.println("f==b");	// true
			if(d==b) System.out.println("d==b");	// true
			
			System.out.println(TextElements.MINISEPARATOR);
			
			if(b==bd) System.out.println("b==bd");	// true
			if(l==bw) System.out.println("l==bw");	// true
			if(f==bw) System.out.println("f==bw");	// true
			if(d==bw) System.out.println("d==bw");	// true
			
			System.out.println(TextElements.MINISEPARATOR);
			
//			if(bw==sw) System.out.println("b==sw");	// DOES NOT COMPILE
//			if(lw==bw) System.out.println("l==bw");	// DOES NOT COMPILE
//			if(fw==bw) System.out.println("f==bw");	// DOES NOT COMPILE
//			if(dw==bw) System.out.println("d==bw");	// DOES NOT COMPILE
			
			if(bd==bw) System.out.println("bd==bw"); // false
			if(ld==lw) System.out.println("ld==lw"); // false
			if(id==iw) System.out.println("id==iw"); // false
			if(fd==fw) System.out.println("fd==fw"); // false
			if(dd==dw) System.out.println("dd==dw"); // false
			
			System.out.println(TextElements.MINISEPARATOR);
			
			if(bw.equals(sw)) System.out.println("b.equals(sw)");	// false
			if(lw.equals(bw)) System.out.println("l.equals(bw)");	// false
			if(fw.equals(bw)) System.out.println("f.equals(bw)");	// false
			if(dw.equals(bw)) System.out.println("d.equals(bw)");	// false
			
			System.out.println(TextElements.MINISEPARATOR);
			
			if(bd.equals(bw)) System.out.println("bd.equals(bw)"); // true
			if(ld.equals(lw)) System.out.println("ld.equals(lw)"); // true
			if(id.equals(iw)) System.out.println("id.equals(iw)"); // true
			if(fd.equals(fw)) System.out.println("fd.equals(fw)"); // true
			if(dd.equals(dw)) System.out.println("dd.equals(dw)"); // true
			
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			String s = null;
			s += "asd";
			
			System.out.println(s);
		}

		System.out.println(TextElements.SEPARATOR);
		
		{
			List s1 = new ArrayList();
			s1.add("a");
			s1.add("b");
			s1.add(1, "c");
			List s2 = new ArrayList(s1.subList(1, 1));
			s1.addAll(s2);
			System.out.println(s1);
		}
		
		System.out.println(TextElements.SEPARATOR);
		
		{
			A s1 = new A();
			B s2 = new B();
			s1 = (A) s2;
			
			System.out.println(Integer.MAX_VALUE);
			
			Integer i1 = 1; Integer i2 = new Integer(1);
			
		}
	}
}
