package com.ram.program;

public class CheckPrime 
{
	public static void main(String[] args)
	{
		int num = 3;
		int x;
		
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++)
		{
			x = num%i;
			if(x==0) 
			{
				isPrime=false;
				break;
			}		
		}
		
		if(isPrime)
		{
			System.out.println("It is a Prime number");
		}else
			System.out.println("It is not a Prime number");
	}
	

}
