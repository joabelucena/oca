package chapter5.abstraction;

import java.time.LocalDate;

public abstract class AbstractClassWithMethodDeclaration {
	
	/*
	 * Both Methods does not compile since abstract methods doesn't have bodies 
	 */
	public abstract void sayHello() {}
	public abstract LocalDate getDate(){
		return new LocalDate();
	}

}
