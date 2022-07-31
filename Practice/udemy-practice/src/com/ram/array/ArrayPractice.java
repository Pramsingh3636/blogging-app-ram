package com.ram.array;

public class ArrayPractice {

	public static void main(String[] args) 
	{
	/* 1-D Array 
		int[] roll = {101,102,103,104,105};
		
		for(int rno:roll) {
		System.out.println(rno);
		}
		
		int[] roll = {101,102,103,104,105};
		
		for(int i =0; i<5; i++) {
			System.out.print(roll[i]);
	*/
			
	/* 2-D Array 
		
		int[][] marks = new int [2][3];
		
		marks [0][0] = 101;
		marks [0][1] = 102;
		marks [0][2] = 103;
		marks [1][0] = 201;
		marks [1][1] = 202;
		marks [1][2] = 203;
		
		for(int i =0; i<marks.length; i++) {
			for(int j =0; j<marks[i].length; j++) {
				System.out.print(marks[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
    */

/*		1. Practice problem
		print the sum of Array of float
		
		float[] num = {23.5f, 76.8f, 54.0f, 679.9f};
		float sum = 0;
		
		for(float element: num) {
			sum = sum + element;
		}
		System.out.println("the sum of all num : "+ sum);
*/
		
/*		2. Practice problem
		whether is given integer is present in an Array or not
		
		int[] marks = {23, 76, 54, 67, 43};
		int num = 54;
		
		boolean isInArray = false;
		for(int element : marks) {
			if(num==element) {
				isInArray = true;
				break;
			}
		}
		if(isInArray) {
			System.out.println("This value is present in the array");
		}else {
			System.out.println("This value is not present in the array");
		}
*/
		
/*		3. Practice problem
		print the average marks from an Array 
		
		int[] marks = {23, 76, 54, 67, 43};
		int sum = 0;
		
		for(int element: marks) {
			sum = sum + element;
		}
		System.out.println("the value of average marks : "+ sum/marks.length);
*/
		
		/* 4. Practice Problem
		 * adding two Matrix and print in 2-D array
		
		
		int[][] mat1 = {{1,2,3},
				         {6,7,7}};
		int[][] mat2 = {{11,7,3},
		                 {5,17,23}};
		int[][] result = {{0,0,0},
		                 {0,0,0}};
		
		for(int i =0; i<mat1.length; i++) {
			for(int j =0; j<mat1[i].length; j++) {
				System.out.printf(" setting value of i=%d and j=%d is \n", i,j);
				result[i][j]= mat1[i][j]+mat2[i][j];
			}
		}
		for(int i =0; i<mat1.length; i++) {
			for(int j =0; j<mat1[i].length; j++) {
				System.out.print(result[i][j] + " ");
				result[i][j]= mat1[i][j]+mat2[i][j];
			}
			System.out.println("");
			
		}
		 */
/*		5. Practice Problem
		reverse in Array
		
		int[] arr = {2,65,48,34,5,98,45,27,11};
		int l = arr.length;
		
		int n = Math.floorDiv(l, 2); // arr.length/2
		int temp;
		
		for(int i=0; i<l; i++) {
			//swap arr[i] with arr[l-1-i]
			
			temp = arr[i];
			arr[i] = arr[l-1-i];
			arr[l-1-i] = temp;
		}
		for(int element : arr) {
		System.out.print(element + " ");
		}
	*/
	/* 	6. Practice Problem
	 * maximum in Array
	 
		int[] arr = {2,65,48,34,-5,-98,45,27,11};
		int max = Integer.MIN_VALUE;
		
		for(int element : arr) {
			if(element>max) {
				max = element;
			}
		}
		System.out.println("Maximum Value in array : " + max);
		
		*/
		
		/* 	7. Practice Problem
		 * Minimum in Array
		int[] arr = {2,65,48,34,-5,-98,45,27,11};
		int min = Integer.MAX_VALUE;
		
		for(int element : arr) {
			if(element<min) {
				min = element;
			}
		}
		System.out.println("Minimum Value in array : " + min);
		
		*/
		
		/* 	8. Practice Problem
		 * whether Array is sorted or not
		 
		int[] arr = {2,65,48,34,5,98,45,27,11};
		boolean isSorted = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		if(isSorted) {
			System.out.println("the array is sorted");
		}else {
			System.out.println("the array is not sorted");
		}
		*/
	}

}







