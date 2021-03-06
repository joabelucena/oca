package chapter6;


public class Exceptions {

	public static void CheckedException() throws Exception {

		System.out.println("throwing an exception");

		throw new Exception("This is an exception");

	}

	public static void UnCheckedException() {

		System.out.println("throwing a runtime exception");

		throw new RuntimeException("This is a runtime exception");

	}

	public static void Error(){
		throw new Error("Method with errors");
	}
	
	public static void NoException() {
		System.out.println("I'm a good method");
	}
	
	

	public static void main(String[] args) {
				
		/*
		 * Must be handled
		 */
		try {
			CheckedException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		/*
		 * May or may not be handled
		 */
		try {
			UnCheckedException();	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		 * Can't be handled
		 */
		try {
			Error();
		} catch (Exception e) {
			//Never get called
			System.out.println(e.getMessage());
		}

		//Never get called: stops on error
		NoException();

	}

}
