package com.multithreading;


// by extending a thread class

class T1 extends Thread{
	public void run() {
		System.out.println("run() method is running" +Thread.currentThread().getName());
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main() method is running" +Thread.currentThread().getName());
		T1 th= new T1();
		th.start();
	}

}
