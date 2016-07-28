package chapter5.modifiers.y;

import chapter5.modifiers.x.X;
import chapter5.modifiers.z.Z;

public class Y extends X {
	
	private X x;
	
	public void getPublicY() {
		System.out.println("return public Y");
	}
	
	protected void getProtectedY() {
		System.out.println("return protected Y");
	}
	
	public static void main(String...args){
		Y y = new Y();
		
		y.getProtectedX();
		y.getProtectedY();
		y.getPublicX();
		y.getPublicY();
		
		X x = new X();
		x.getPublicX();
		
		Z z = new Z();
		
	}
}
