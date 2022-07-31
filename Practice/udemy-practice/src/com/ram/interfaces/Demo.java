package com.ram.interfaces;

public class Demo {

	public static void main(String[] args)
	{
		
		Phone phone1 = new Iphone8();
		System.out.println("Iphone8 details here");
		System.out.println("Processor : "+phone1.processor());
		System.out.println("Space in GB : "+phone1.spaceInGB());
		
		Phone phone2 = new OnePlus5();
		System.out.println("OnePlus5 details here");
		System.out.println("Processor : "+phone2.processor());
		System.out.println("Space in GB : "+phone2.spaceInGB());


	}

}
