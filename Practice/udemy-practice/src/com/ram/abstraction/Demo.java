package com.ram.abstraction;

public class Demo {

	public static void main(String[] args) {

		Person person1 = new Vegan();
		person1.speak();
		person1.eat();
		
		System.out.println("*********");
		
		Person person2 = new NonVegan();
		person2.speak();
		person2.eat();
		
	}

}
