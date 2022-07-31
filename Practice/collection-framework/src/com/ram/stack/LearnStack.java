package com.ram.stack;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) 
	{
		Stack<String> animals = new Stack<>();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Elephent");
		animals.add("Lion");
		
		System.out.println("stack : "+animals); // first fill in and last find out(layer) -> first in last out
		
		System.out.println(animals.peek()); // pick up the last element
		animals.pop(); // clear it from the list
		System.out.println("stack : "+animals);
		
		animals.push("Tiger"); // add the element
		System.out.println("stack : "+animals);
	}

}
