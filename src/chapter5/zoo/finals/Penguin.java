package chapter5.zoo.finals;

class Bird {
	
	public final boolean hasFeathers() {
		return true;
	}
}


public class Penguin extends Bird {
	
	public static void main(String[] args) {
		Penguin pg = new Penguin();
	}
	
	//DOES NOT COMPILE: 'final' methods cannot be overhidden
//	public final boolean hasFeathers() {
//		return false;
//	}
}
