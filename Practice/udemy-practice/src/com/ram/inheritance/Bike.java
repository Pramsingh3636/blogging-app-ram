package com.ram.inheritance;

public class Bike extends Vehicle
{
	private String handle;

	public Bike(String engine, int wheels, int seats, int fuelTank, String light, String handle) {
		super(engine, wheels, seats, fuelTank, light);
		this.handle = handle;
	}

	public Bike() {
		super();
	}

	public String getHandle() {
		return handle;
	}

	@Override
	public String toString() {
		return "Bike [handle=" + handle + ", getHandle()=" + getHandle() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + ", getFuelTank()=" + getFuelTank()
				+ ", getLight()=" + getLight() + "]";
	}

}
