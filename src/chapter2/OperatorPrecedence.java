package chapter2;

public class OperatorPrecedence {
	public static void main(String[] args) {
		
		//Operator precedence
		{
			/*
			 * This is the order operator are evaluated by Java:
			 * 
			 * 1. x++ e ++x		(in this order post, then pre)
			 * 2. +, -, !		(variable 'modifiers' positive negative, boolean)
			 * 3. *, /, %		(multiplication)
			 * 4. +, - 			(addition)
			 * 5. >, >=, <, <=	(relational)
			 * 6. ==, !=		(equal)
			 * 7. ||, &&		(logical)
			 * 8. b ? e1 : e2	(ternary)
			 * =, +=, -=		(assignment)
			 * 
			 */
			
			int x = 2;
			int y = 5;
			
			int z = x + y * x / y * y % x - x++ + --x / --y + x;
			
//			int z = x++ - ++x;
			
//			int z = x++ + 2 * x--;

//			int z = ++x + x++ + x++ + ++x - x-- + --x;
			
			System.out.println(z);
			System.out.println(x);
			
		}
		
		
	}
}
