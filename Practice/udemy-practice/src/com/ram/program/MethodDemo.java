package com.ram.program;

public class MethodDemo {

	public static void main(String[] args) 
	{ 
		loop(1, 5);
		System.out.println("******");
		loop(10, 15);
		System.out.println("******");
		loop(20, 25);

	}
	public static void loop(int stepvalue, int finalvalue)
	{
		while(stepvalue <= finalvalue) {
			System.out.println(stepvalue);
			stepvalue++;
		}
	}

}
