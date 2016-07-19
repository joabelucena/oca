package chapter2;

public class WhileStatement {
	final static int x = 3;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		
		while(x > 4){
			//It's never executed
			System.out.println(x);
		}
		
		do {
			//Executes once
			System.out.println(++x);
		} while (x > 4);
		
		
		
		
	}
	

}
