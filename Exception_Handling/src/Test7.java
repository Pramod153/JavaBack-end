package com.ExceptionHandling;

public class Test7 {
	
//	try with multiple catch
	public static void m1() {
		try {
			int[] arr= {1,2};
			System.out.println(arr[7]);
			
		}catch(ArithmeticException e) {
			System.out.println("first catch");
			System.out.println(e.getClass().getName());
		}catch(NullPointerException e) {
			System.out.println("second catch");
			System.out.println(e.getClass().getName());
		}catch(Exception e) {
			// ** parent class must be the last catch block not  above child class
//			(if it is there erros code is unreachable
			System.out.println("third catch");
			System.out.println(e.getClass().getName());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
