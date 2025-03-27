package com.multithreading;

public class Sleep {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Thread A:"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=11;i<=20;i++) {
				System.out.println("Thread B:"+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t1.join();
		t2.start();

	}

}
