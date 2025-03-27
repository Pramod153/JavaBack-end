package com.multithreading;

public class ThreadScheduler {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main thread started"+"Priority"+Thread.currentThread().getPriority());
		
		Thread t1 =new Thread(()->{
			System.out.println("starting thread;" +Thread.currentThread().getName());
			System.out.println("Ending Thread:"+Thread.currentThread().getName());
		});
		Thread t2 =new Thread(()->{
			System.out.println("starting thread;" +Thread.currentThread().getName());
			System.out.println("Ending Thread:"+Thread.currentThread().getName());
		});
		t1.setName("anurag"); 
		t2.setName("pramod"); 
		
//		t1.setPriority(10);// hint to the thread scheduler using set priority function
//		t2.setPriority(1);
		
		t2.start();
		t1.start();
		t1.join();
		t2.join();
		
		System.out.println("main thread ended");
	} 

}
