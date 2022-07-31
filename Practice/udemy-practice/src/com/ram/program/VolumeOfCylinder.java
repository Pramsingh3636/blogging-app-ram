package com.ram.program;

public class VolumeOfCylinder {

	public static void main(String[] args) 
	{
		System.out.println("volume of cylinder = " + volumeOfCylinder(7, 20));

	}
//	Volume = PI*r*r*h
	public static double volumeOfCylinder(double red, double high)
	{
		return Math.PI*red*red*high;
	}

}
