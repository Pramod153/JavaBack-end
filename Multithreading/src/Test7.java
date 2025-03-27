package com.multithreading;

public class Test7  implements Runnable{
	
	

	@Override
	public void run() {
		System.out.println("run() method is running" +Thread.currentThread().getName());
	}
	public void run(int a) {
		System.out.println("run() method is running" +Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 t1 = new Test7();
		Thread th= new Thread(t1);
		t1.run(10);
		th.start();
	}

}
