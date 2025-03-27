package com.multithreading;

class Bank{
	static int amt=1000;
}
class BankUtil{
	public synchronized void withdraw(int reqAmt) throws InterruptedException {
		if(reqAmt>Bank.amt) {
			System.out.println("thread is waiting");
			this.wait(5000);
		}
		System.out.println("amount added"); 
		System.out.println("amount withdrawn succesfully");
	}
	
	public synchronized void deposit(int depAmt) throws InterruptedException {
		System.out.println("depositing required amount");
		Bank.amt= Bank.amt+ depAmt;
//		this.notify();
		System.out.println("amount deposited  succesfully");
	}
}
public class Important {

	public static void main(String[] args) {
		
		BankUtil bank = new BankUtil();
		Thread t1= new Thread(()->{
			try {
				bank.withdraw(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		Thread t2= new Thread(()->{
			try {
				bank.deposit(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t1.start();
		t2.start();
	}

}
