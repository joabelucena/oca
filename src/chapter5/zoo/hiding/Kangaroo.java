package chapter5.zoo.hiding;


public class Kangaroo extends Marsupial {

	/*
	 * Hiding version
	 */
//	public static boolean isBiped() {
//		return true;
//	}
	
	/*
	 * Overriding version
	 */	
	public boolean isBiped() {
		return true;
	}
	
	/********************************************************/
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs: " + isBiped());
	}
	
	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		joey.getKangarooDescription();
	}
	
}
