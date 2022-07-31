package Assignment1;

import java.util.Arrays;

public class ReverseArrayList {

	public static void main(String[] args)
	{
		int[] arr = {34,65,2,865,14,34,9,111,27};
		System.out.println("Array List : " + Arrays.toString(arr));
		
		reverse(arr);
		System.out.println("Reverse List : " +Arrays.toString(arr));
		
	}
	private static void reverse(int[] arr) 
	{
		int start =0;
		int end =arr.length-1;
		
		while(start<end) {
			swap(arr, start, end);
			start++;
			end--;
		}	
	}
	private static void swap(int[] arr, int start, int end) 
	{
		int swap = arr[start];
		arr[start]=arr[end];
		arr[end]=swap;
		
	}

}
