package com.ram.exception;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		int x=2;
		try {
			System.out.println("we don't know what will i get the output : "+ x/0);
		}catch(RuntimeException e) {
			System.out.println("Runtime Exception"); //child class of Exception class(parent class) =>> firstly printed
		}catch(Exception e) {
			System.out.println(" Exception ");
		}finally {
			System.out.println("The value get ready to print");  // 
		}

	}

}
