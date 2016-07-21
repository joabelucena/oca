package chapter4;

public class Constructor {
	public static void main(String[] args) {
		
		Hamster hm = new Hamster(25);
		System.out.println(hm.getColor());
		
		//Variable instantiated through default constructor
		Rabbit rb = new Rabbit();
		
		MouseHouse h = new MouseHouse(2, 2, 2);
		System.out.println(h.volume);

	}

}

/*
 * Overloading contructors
 */
class Hamster{
	private String color;
	private int weight;
	public Hamster(int weight){
		this(weight, "brown");	//Must be the first statement at constructor body
	}
	
	public Hamster(int weight, String color){
		this.weight = weight;
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}


/*
 * Default constructor
 */
class Rabbit{
	
	/* Java automatically creates a default constructor when NO CONSTRUCTOR WE DEFINED FIRST
	 * Default contructor
	 * public Rabbit(){
	 * 
	 * }
	 *
	 */
	
}

/*
 * Final Assignment
 */
class MouseHouse {
	final int volume;
	final String name = "The Mouse House";
	public MouseHouse(int length, int width, int height){
		volume = length * width * height;
	}
}
