package com.ram.extendsthread;


class MyCounter extends Thread{
	private int thredNo;

	public MyCounter(int thredNo) {
		super();
		this.thredNo = thredNo;
	}
	public void run() {
		countMe();
	}

	public void countMe() {
		for(int i=0; i<=9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is : "+i +"the value of thread is : "+thredNo);
		}
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		MyCounter counter1 = new MyCounter(11);
		MyCounter counter2 = new MyCounter(12);

		Long startTime = System.currentTimeMillis();
		counter1.start();
		System.out.println("***********");
		counter2.start();
		Thread.sleep(5000);
		long endTime = System.currentTimeMillis();

		System.out.println("The total time requiered to process : " + (endTime-startTime));

	}

}
