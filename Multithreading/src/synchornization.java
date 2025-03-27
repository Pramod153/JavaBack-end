package com.multithreading;


// problem without synchronization
public class synchornization {
	private static int counter=0;
	public static void main(String[] args) throws InterruptedException {
		Thread t1= new Thread(()->{
			System.out.println("thread1");
			for(int i=1;i<= 10000; i++) {
				incrementcounter();
			}
		});
		Thread t2= new Thread(()->{
			System.out.println("thread2");
			for(int i=1;i<= 10000; i++) {
				incrementcounter();
				
			}
		});
		
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println("counter value: "+ counter);

	}
	private static synchronized void incrementcounter() {
		counter++;
	}

}
