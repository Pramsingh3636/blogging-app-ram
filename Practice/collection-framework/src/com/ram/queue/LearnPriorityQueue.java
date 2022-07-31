package com.ram.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> seatNo = new PriorityQueue<>(); // Minimum value-> 1st priority to get min value
		
//		PriorityQueue<Integer> seatNo1 = new PriorityQueue<>(Comparator.reverseOrder()); // Maximum value-> 1st priority to get max value
		
		seatNo.offer(12);
		seatNo.offer(24);
		seatNo.offer(40);
		seatNo.offer(45);
		
		System.out.println(seatNo);
		
		System.out.println(seatNo.peek());
		
		System.out.println(seatNo.poll());
		
		System.out.println(seatNo);
		
	}

}
