package com.ram.encapsulation;

public class Person 
{
	private String name;
	private int age;
	private String city;
	private String phone;
	
	public Person() 
	{
//		this.name = "Ram";
//		this.age = 22;
//		this.city = "Katni";
//		this.phone = "xxxx";
		
	}
	public Person(String name, int age, String city, String phone) 
	{
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public boolean setAge(int age) {
		if(age>=0 && age<=100) {
		this.age = age;
		return true;
		}
		return false;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + ", phone=" + phone + "]";
	}
	
	
	
	
	

}
