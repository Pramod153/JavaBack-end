package com.multithreading;


// by implementing a runnable interface
class T2 implements Runnable{

	@Override
	public void run() {
		System.out.println("run() method is running" +Thread.currentThread().getName());
		
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() method is running" +Thread.currentThread().getName());
		T2 th= new T2();
		Thread obj = new Thread(th);
		obj.start();
	}

}
