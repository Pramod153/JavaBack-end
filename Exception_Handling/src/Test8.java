package com.ExceptionHandling;

public class Test8 {
	public static void m1() {
		try {
			String str=null;
			System.out.println(str.length());
			try {
				int result =12/0;
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("handled by inner catch");
				
			}
		}catch(Exception e) {
			System.out.println("handled by outer catch");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
