package chapter4;

public class AccessModifiers {
	
	
	/*
	 * Access modifiers are used to control the access for methods and/or variables.
	 * This is how they works
	 * 
	 * Access		Description
	 * **************************************
	 * private		Can be accessed from within the same class.
	 * no-modifier	Can be accessed from classes within the same package
	 * protected	Can be accessed from classes within the same package OR sub-classes
	 * public		Can be accessed from anywhere
	 * 
	 */

	public static void main(String[] args) {
		
		AccessModifiers am = new AccessModifiers();
		
		am.getPrivate();
		am.getPublic();
		am.getProtected();
		am.getDefault();
	}
	
	public void getPublic(){
		System.out.println("Hi, I'm a PUBLIC method");
	}
	
	protected void getProtected(){
		System.out.println("Hi, I'm a PROTECTED method");
	}
	
	void getDefault(){
		System.out.println("Hi, I'm a NO-MODIFIER (default) method");
	}
	
	private void getPrivate(){
		System.out.println("Hi, I'm a PRIVATE method");
	}
	
	

}
