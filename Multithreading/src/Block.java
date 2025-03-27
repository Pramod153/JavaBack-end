package com.multithreading;

public class Block {
	
	private static int counter1=0;
	private static int counter2=0;
	
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			for(int i=1;i<=10000;i++) {
				incrementcounter1();
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=1;i<=10000;i++) {
				incrementcounter2();
			}
		});
		
		t1.start();
		
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(counter1+" "+ counter2);
	}

	private static void incrementcounter2() {
		
		synchronized(lock1) {
			counter1++;
		}
	}

	private static void incrementcounter1() {
		synchronized(lock2) {
			counter2++;
		}
		
	}

}
