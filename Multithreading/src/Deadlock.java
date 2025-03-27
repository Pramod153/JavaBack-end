package com.multithreading;


class SharedResource{
	static final String resource1= "PEN";
	static final String resource2 = "Paper"; 
}
class Thread1 extends Thread{
	public void run() {
		synchronized (SharedResource.resource1) {
			System.out.println("thread1 aquired the lock of pen, waiting for paper");
			synchronized (SharedResource.resource2) {
				System.out.println("task completed");
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		synchronized (SharedResource.resource1) {
			System.out.println("thread2 aquired the lock of paper, waiting for pen");
			synchronized (SharedResource.resource2) {
				System.out.println("task completed");
			}
		}
	}
}
public class Deadlock {

	public static void main(String[] args)  {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
//		t1.join();
		t2.start();
	}

}
