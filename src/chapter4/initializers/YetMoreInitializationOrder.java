package chapter4.initializers;

public class YetMoreInitializationOrder {
	static { add(2); }
	static void add(int num) { System.out.print(num + " "); }
	public YetMoreInitializationOrder() {add(5); }
	static{ add(4); }
	{ add(6); }
	static { new YetMoreInitializationOrder(); }
	{ add(8); }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


//2 4 6 8 5