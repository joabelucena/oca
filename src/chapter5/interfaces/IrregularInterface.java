package chapter5.interfaces;

/*
 * DOES NOT COMPILE: interface must be marked as 'public' and do not
 * have the final specifier also since it pretends to be instantiated
 */
private final interface IrregularInterface {
	
	//DOES NOT COMPILE: interface's methods must be default access at least
	private void method1();
	
	//DOES NOT COMPILE: only public and default access are allowed
	protected abstract double depth();
	
	//DOES NOT COMPILE: 'final' methods are not allowed since it must be implemented. 
	//It also conflicts with the abstract (assumed) keyword 
	public final void surface();

}
