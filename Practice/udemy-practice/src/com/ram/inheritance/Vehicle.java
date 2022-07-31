package com.ram.inheritance;

public class Vehicle 
{
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String light;
	
	public Vehicle(String engine, int wheels, int seats, int fuelTank, String light) 
	{
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.light = light;
	}

	public Vehicle()
	{
		super();
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLight() {
		return light;
	}

	public void run() {
		System.out.println("completed");
		System.out.println(toString());
	}
	
}
