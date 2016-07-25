package chapter5.abstraction.zoo;


//DOES NOT COMPILE: The first concrete class must implement all abstract methods
class Bird extends Animal {
}

public class Flamingo extends Bird {
	public String getName() {
		return "Flamingo";
	}

}
