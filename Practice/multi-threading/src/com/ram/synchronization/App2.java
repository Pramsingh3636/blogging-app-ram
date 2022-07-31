package com.ram.synchronization;

class Bracket{
	private Object lock = "lock"; // hidden object or we used 'this'
	public void generate() {
		synchronized (lock) {
			
		for(int i=0; i<=10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i<=5) {
				System.out.print("[");
			}else {
				System.out.print("]");
			}
		}
		System.out.println();
		}
		for(int j=0; j<=10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/*
 * synchronized method approach
 * time required =8000
 * 
 * synchronized block approach 
 * time required = 4950
 */


public class App2 {

	public static void main(String[] args) {
		Brackets bracket = new Brackets();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();

				for(int i=0; i<=5; i++) {
					bracket.generate("Thread 1");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("time required for thread2 : "+(endTime-startTime));
			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {

				long startTime = System.currentTimeMillis();
				for(int i=0; i<=5; i++) {
					bracket.generate("Thread 2");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("time required for thread2 : "+(endTime-startTime));
			}
		}).start();

	}

}
