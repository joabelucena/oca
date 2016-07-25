package chapter5.zoo;


class Primate{
	public Primate(){
		//1 - super()
		System.out.println("Primate");
	}
}

class Ape extends Primate{
	public Ape(){
		//2 - super()
		System.out.println("Ape");
	}
}
public class Chimpanzee extends Ape{
	public static void main(String[] args) {
		new Chimpanzee();
	}
	
	/*
	 * 3 - 
	 * public Chimpanzee(){
	 * 		super();
	 * }
	 */
}
