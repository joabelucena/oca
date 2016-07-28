package chapter5.modifiers.z;

import chapter5.modifiers.x.X;
import chapter5.modifiers.y.Y;

public class Z extends Y {
	
	public void getPublicZ() {
		System.out.println("return public Z");
	}
	
	protected void getProtectedZ() {
		System.out.println("return protected Z");
	}
	
	public static void main(String...args){
		Z z = new Z();
		
		
		/*
		 * Z access everything, since it's extending Y that extends Z and subclasses can access protected
		 * members
		 */
		z.getProtectedX();
		z.getProtectedY();
		z.getProtectedZ();
		
		z.getPublicX();
		z.getPublicY();
		z.getPublicZ();
		
		X x = z;
		
		x.getPublicX();
		
		Y y = z;
		
		y.getPublicX();
		y.getPublicY();
		
		
	}
	
}
