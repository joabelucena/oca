package chapter5.abstraction.zoo;

public class Lion extends BigCat {

	@Override
	public void roar() {
		System.out.println("The lion lets out a loud ROARRR!!");

	}
	
	
	/*	
	 * >> Rule Exception <<
	 * COMPILES SUCCESSFULLY: When an intermediate abstract class provides an implementation 
	 * of an abstract method, it's not required to be re-implemented by the concrete class 
	 */
//	@Override
//	public String getName() {
//		return "Lion";
//	}

}
