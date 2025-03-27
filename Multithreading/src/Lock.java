package com.multithreading;


class PrintNum{
	
	public  synchronized void print(int SN, int EN) {
		for(int i=SN ; i<= EN; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+i);
		}
	}
}
public class Lock {

	public static void main(String[] args) {
		PrintNum obj = new PrintNum();
		PrintNum obj1 = new PrintNum();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.print(1, 10);
//				PrintNum.print(1, 10);
				
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj1.print(11, 20);
//				PrintNum.print(11, 20);
			}
			
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.print(21, 30);
//				PrintNum.print(21, 30);
			}
			
		});
		t1.start();
		t2.start();
		t3.start();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
	}

}
