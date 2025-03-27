package com.multithreading;

public class Join {
	static int count=0;
	static int count1=0;

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()->{
			System.out.println("thread a started");
			for(int i=1;i<=10;i++) {
//				incrementCount();
				count++;
				
			}
		});
		Thread t2 = new Thread(()->{
			System.out.println("thread b started");
			for(int i=1;i<=10;i++) {
//				incrementCount1();
				count1++;
				
			}
		});
		
		t2.start();
		t2.join();// maintain order.
		t1.start();
		t1.join();
		
		
		System.out.println("count= "+count+" count1 =" +count1);

	}

//	private static void incrementCount1() {
//		count1++;
//	}

//	private static void incrementCount() {
//		count++;
//		
//	}

}
