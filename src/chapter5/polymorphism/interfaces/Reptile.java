package chapter5.polymorphism.interfaces;

public interface Reptile {
	public default String getName() {
		return "Reptile";
	}
}
