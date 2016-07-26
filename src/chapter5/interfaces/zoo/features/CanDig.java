package chapter5.interfaces.zoo.features;

public interface CanDig {

	//DOES NOT COMPILE: only public variables are allowed
	private int MAXIMUM_DEPTH = 100;
	
	//DOES NOT COMPILE: protected conflicts with public, and abstract conflicts
	//with final. Both conflicts with the constant concept
	protected abstract boolean UNDERWATER = false;
	
	//DOES NOT COMPILE: This variable has not been assigned, and since it's final it'll never be able to.
	public static String TYPE;
}
