package com.multithreading;

public class Test6 implements Runnable{
	
	

	@Override
	public void run() {
		
		System.out.println("run() method is running" +Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Test6());
//		t1.start();
		t1.run();  // always run by  main thread only 

	}

}
