package com.ram.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) 
	{
		Queue<Integer> ticketNo = new LinkedList<>();
		
		ticketNo.offer(11); // add the element
		ticketNo.offer(12);
		ticketNo.offer(13);
		ticketNo.offer(14);
		
		System.out.println(ticketNo);
		
		System.out.println(ticketNo.peek()); //show the head value for retrieve
		
		System.out.println(ticketNo.poll()); // retrieve the head value
		
		System.out.println(ticketNo);

	}

}
