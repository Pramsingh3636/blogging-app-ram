package com.ram.polymorphism;

public class Demo {

	public static void main(String[] args) 
	{
//		Phone phone = new Phone("Note9");
//		System.out.println(phone);
		
		Phone samsung = new Demo().phone(1);
		System.out.println(samsung.getModel());
		samsung.feature();
		
		Phone redmi = new Demo().phone(2);
		System.out.println(redmi.getModel());
		redmi.feature();
		
	}
	public Phone phone(int dailyDriver)
	{
		switch (dailyDriver) {
		case 1: return new Samsung("Note 5");
		case 2: return new Redmi("Note 9");
		}
		return null;
	}

}
