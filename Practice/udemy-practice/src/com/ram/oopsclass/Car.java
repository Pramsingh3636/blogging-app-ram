package com.ram.oopsclass;

public class Car 
{
	private String doors;
	private String engine;
	private String driver;
	private double speed;

	public Car(String doors, String engine, String driver, double speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String run(){
		if(doors.equals("closed") && engine.equals("start") 
				&& driver.equals("seated") && speed>0) {
			return "running";
		}else
			return "not running";
	}
}
