package com.ram.encapsulation;

public class Demo {

	public static void main(String[] args) 
	{
//		Person person = new Person();
//		System.out.println(person);
		
		Person person = new Person("Ramsingh", 22, "Jabalpur", "yyyy");
		System.out.println(person);
		
		person.setAge(-22);
		System.out.println(person);

	}

}
