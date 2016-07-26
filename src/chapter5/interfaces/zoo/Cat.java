package chapter5.interfaces.zoo;

import chapter5.interfaces.zoo.features.Run;
import chapter5.interfaces.zoo.features.Walk;

/*
 * DOES NOT COMPILE: Since has two default methods with same signature, the code won't compile
 */
public class Cat implements Walk, Run {

	/*
	 * Overriding the duplicated default method, the code will compile
	 */
	public int getSpeed(){
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}
