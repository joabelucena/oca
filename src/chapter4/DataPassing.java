package chapter4;

public class DataPassing {
	

	public static void main(String[] args) {
		
		int num = 4;
		newNumber(num);
		System.out.println(num);		//prints 4
		
		String name = "Webby";
		speak(name);
		System.out.println(name);		//prints Webby
		
		StringBuilder s = new StringBuilder(name);
		speak(s);
		System.out.println(s);			//prints Webby Sparky

	}
	
	/*
	 * Java is pass-by-value language and the assignments doesn't change variable's value
	 */
	public static void newNumber(int num){
		num = 8;
	}
	
	public static void speak(String name){
		name = "Sparky";
	}
	
	/*
	 * 
	 */
	public static void speak(StringBuilder s){
		s.append(" Sparky");
	}

}
