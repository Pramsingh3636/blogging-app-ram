package com.ram.program;

public class MethodOverloading {

	/* => When two or more methods name are same but parameter(signature) should be different */
	public static void main(String[] args) 
	{
		System.out.println("All 3 int values : " + sum(2, 5, 16));
		System.out.println("2 int + 1 double : " + sum(76, 43, 23.50d));
		System.out.println("1 int + 1 float + 1 double : " + sum(1, 2.5f, 67.34f));
		System.out.println("All 2 int values : " + sum(3, 65));
		System.out.println("1 int + 1 float : " + sum(7, 6.45f));
		

	}
	public static int sum(int x, int y, int z)
	{
		return x+y+z;
	}
	public static double sum(int x, int y, double z)
	{
		return x+y+z;
	}
	public static float sum(int x, float y, float z)
	{
		return x+y+z;
	}
	public static int sum(int x, int y)
	{
		return x+y;
	}
	public static float sum(int x, float y)
	{
		return x+y;
	}

}
