package Assignment1;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) 
	{
		int[] arr = {65,32,675,2,11};
		System.out.println("ArrayList : " +Arrays.toString(arr));
	
//		Replace 2nd first with 2nd last
		swap(arr, 1, 3);
		System.out.println("Replace 2nd first with 2nd last : " +Arrays.toString(arr));
		

	}
	static void swap(int[] arr, int index1, int index3)
	{
		int a = arr[index1];
		arr[index1] = arr[index3];
		arr[index3] =a;

	}

}
