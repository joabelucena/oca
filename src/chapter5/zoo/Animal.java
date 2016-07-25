package chapter5.zoo;

public class Animal {
	private int age;
	private String name;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	/*
	 * Constructors
	 */
	public Animal(){
		System.out.println("Animal() constructor");
	}

	
	public Animal(int age){
		super();
		this.age = age;
		System.out.println("Animal(int age) construtctor");
	}
	
	public Animal(int age, String name){
		super();
		this.age = age;
		this.name = name;
	}
	
	
}
