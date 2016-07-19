package chapter2;

public class SwitchStatement {

	public static void main(String[] args) {
		
		WhileStatement ws = new WhileStatement();
		
		System.out.println(ws.x);

		final int dayOfWeek = 6;
		
		/*
		 * since you don't put a 'break' statement, your code will run all post statements it reach.
		 */
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
		
		case 6:
			System.out.println("Saturday");
//		default:
//			System.out.println("WeekDay");
		case 4:
			System.out.println("Thursday");
		case 5:
			System.out.println("Friday");
		
		}
	}

}
