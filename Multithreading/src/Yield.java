package com.multithreading;

public class Yield {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			
			System.out.println("Thread A started");
			Thread.yield();
			System.out.println("Thread A completed");
		});
		Thread t2 = new Thread(()->{
					
					System.out.println("Thread B started");
//					Thread.yield();
					System.out.println("Thread B completed");
				});
		Thread t3 = new Thread(()->{
			
			System.out.println("Thread c started");
//			Thread.yield();
			System.out.println("Thread c completed");
		});
		t1.start();
		t2.start();
//		t2.join();
		t3.start();

	}

}
