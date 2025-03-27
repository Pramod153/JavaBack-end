package com.multithreading;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("main method is running" +Thread.currentThread().getName());
		
		Thread t1 = new Thread(()->{
			System.out.println("task is executed by " +Thread.currentThread().getName());
		});
		t1.start();
	}

}
// lamda expression.