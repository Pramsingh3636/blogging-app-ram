package com.ram.learnCollection;

public class Student implements Comparable<Student>
{
	String name;
	int rollNo;
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int compareTo(Student that) {
		
		return this.rollNo- that.rollNo;
	}
	
	

}
