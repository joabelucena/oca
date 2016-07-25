package chapter5.zoo.hiding;

public class Panda extends Bear {

	public static void eat() {
		System.out.println("Panda bear is chewing");
	}
	
	//DOES NOT COMPILE: Hidden methods must have the same signature and static decalration on both sides
//	public void sneeze() {
//		System.out.println("panda bear sneezes quietly");
//	}
//
//	public static void hibernate() {
//		System.out.println("Panda bear is going to sleep");
//	}

	public static void main(String[] args) {
		Panda.eat();
		Bear.eat();
	}
}
