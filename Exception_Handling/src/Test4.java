package com.ExceptionHandling;

public class Test4 {
	public static void m1() {
		try {
			String str = null;
			System.out.println(str.length());//null pointer
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("exception handled");
		}
		System.out.println("out of try-catch");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
