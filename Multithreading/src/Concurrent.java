package com.multithreading;

public class Concurrent {

	public static void main(String[] args) {
		
		System.out.println("main thread started");
		
		Thread t1 =new Thread(()->{
			System.out.println("starting thread;" +Thread.currentThread().getName());
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			System.out.println("Ending Thread:"+Thread.currentThread().getName());
		});
		Thread t2 =new Thread(()->{
			System.out.println("starting thread;" +Thread.currentThread().getName());
			for(int i=11;i<=15;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			System.out.println("Ending Thread:"+Thread.currentThread().getName());
		});
//		t1.setName("anurag"); for set thread name
//		t2.setName("pramod"); using setName funaction.
		t1.start();
		t2.start();
		System.out.println("main thread ended");

	}

}
