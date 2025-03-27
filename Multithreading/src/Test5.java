package com.multithreading;

public class Test5 {

	public static void main(String[] args) {
		System.out.println("main() method is running" +Thread.currentThread().getName());
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				System.out.println("run() method is running" +Thread.currentThread().getName());
			}
			
			
		});
		
		t1.start();
	}

}
