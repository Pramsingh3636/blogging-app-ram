package com.ram.program;

public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		System.out.println("Area of Rectangle = " + areaOfRectangle(6.25, 5.75));
		
//		double area = areaOfRectangle(6.25, 5.75);
//		System.out.println(area);
		
	}
	public static double areaOfRectangle(double len, double wid)
	{
		return len*wid;
	}
}
