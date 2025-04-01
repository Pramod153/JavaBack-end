package com.ExceptionHandling;

public class Test5 {

	public  static void m1() {
		
		try {
			String str = null;
			System.out.println(str.length());//null pointer
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("exception handled");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
