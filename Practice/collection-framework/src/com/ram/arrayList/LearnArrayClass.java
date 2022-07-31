package com.ram.arrayList;

import java.util.Arrays;

public class LearnArrayClass {

	public static void main(String[] args)
	{
		int[] num = {54,23,43,57,98,11,23,76,94,223,758,3};
		Arrays.sort(num);
//		
//		int index = Arrays.binarySearch(num, 3);
//		System.out.println(index);
//		
//		
//		Arrays.fill(num, 10);
		
		for(int e : num) {
			System.out.print(e + " ");
		
		}

		
	}

}
