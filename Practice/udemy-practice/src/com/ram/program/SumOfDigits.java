package com.ram.program;

public class SumOfDigits {

	public static void main(String[] args)
	{
		int num = 97496;
		int sumOfDigits = 0;
		
		while(true)
		{
			sumOfDigits = sumOfDigits + num%10;
			num = num/10;
			if(num<10) {
				break;
			}
		}
	 
		sumOfDigits = sumOfDigits + num;
		System.out.println("Sum of Digits = " + sumOfDigits);

	}

}
