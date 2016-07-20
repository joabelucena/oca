package chapter4.specifiers.statics;

public class Static {
	
	private String name = "Static class";
	
	private static String sName = "Static variable";
	
	public static void first(){}
	public static void second(){
		System.out.println(sName);
	}
	
	
	public void third(){
		System.out.println(name);
	}
	
	
	public void fourth(){
		third();
		first();
	}
	
	/*
	 * REMEMBER: >> Static members don't require an instance to work
	 * 
	 * If you statically call a nonstatic member inside a static class, compiler will give you an error.
	 * 
	 * 
	 */
	public static void main(String[] args) {
		first();
		second();
		thrid();		//DOES NOT COMPILE
		
		new Static().third();
	}

}
