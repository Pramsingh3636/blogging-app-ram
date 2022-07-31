package com.ram.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String name;
	private String address;
	private int phone;
	
	public Employee(int empid, String name, String address, int phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public Employee() {
		super();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	

}

