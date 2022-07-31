package com.ram.exception;

public class Exceptions {

	public static void main(String[] args) 
	{
		Exceptions obj = new Exceptions();
		obj.case1(15, 3);
		obj.case1(10, 0);
		System.out.println("********");
		obj.case2(15, 3);
		obj.case2(10, 0);

	}
	public void case1(int x, int y)
	{
		if(y!=0) {
		System.out.println(x/y);
		}else {
			System.out.println("value of y is zero");
		}
	}
	// try catch block Exception
	public void case2(int x, int y)
	{
		try {
		System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("value of y is zero" );
		}
	}


}
