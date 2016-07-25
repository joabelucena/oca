package chapter5.zoo.hiding;

public class Marsupial {
	
	
	/*
	 * Hiding version
	 */
//	public static boolean isBiped() {
//		return false;
//	}
	
	/*
	 * Overriding version
	 */
	
	public boolean isBiped() {
		return false;
	}
	
	
	
	
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: " + isBiped());
	}
	
}
