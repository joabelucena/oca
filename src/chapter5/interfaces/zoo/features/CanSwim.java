package chapter5.interfaces.zoo.features;

public interface CanSwim {
	
	void start();
	int length();
	
	int MAXIMUM_DEPTH = 100;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}

interface CanSwimAfterCompile {
	
	/*
	 * Converts all methods to: 'public abstract'
	 */
	public abstract void start();
	public abstract int length();
	
	/*
	 * Converts all variables to: 'public static final'
	 */
	public static final int MAXIMUM_DEPTH = 100;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}