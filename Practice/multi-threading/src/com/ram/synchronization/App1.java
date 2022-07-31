package com.ram.synchronization;

public class App1 {
	public static int counter =0;

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					App1.counter++;
				}			
			}
		});
		System.out.println("The loops in thread1 is over");

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<1000; i++) {
					App1.counter++;
				}			
			}
		});
		System.out.println("The loops in thread2 is over");
		
		thread1.start();
		thread2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The value of thread is "+App1.counter);
	}
	

}
