package com.ram.implrunnable;

import java.util.Random;

class Mycounter implements Runnable{
	private int threadNo;

	public Mycounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for(int i=1; i<10; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(i);
		}
	}

}

public class App {

	public static void main(String[] args) {

//		Thread thread = new Thread(new Runnable() 

		new Thread(new Runnable()  // anonymous object
		{
			@Override
			public void run() {
				for(int i=1; i<10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		}).start();
		


	}

}
