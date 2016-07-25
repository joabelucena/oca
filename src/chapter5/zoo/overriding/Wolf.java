package chapter5.zoo.overriding;

public class Wolf extends Canine{
	
	/*
	 * For overriding a method, ou must have the same signature (name + parameter list)
	 * and the return type must be the same or at least a subclass of the parent return
	 * 
	 * (non-Javadoc)
	 * @see chapter5.zoo.overriding.Canine#getAverageWeight()
	 */
	public double getAverageWeight(){
		return super.getAverageWeight() + 20;
	}
	
	/*
	 * DOES NOT COMPILE: When a method is overrinden, it must has the same return type.
	 */
//	public int crap(){
//		super.crap();
//		return 0;
//	}
	
	public static void main(String[] args) {
		System.out.println(new Canine().getAverageWeight());
		
		System.out.println(new Wolf().getAverageWeight());
	}

}
