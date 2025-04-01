package com.ExceptionHandling;

public class Test6 {
	public static void m1() {
		try {
			int[] arr= {1,2};
			System.out.println(arr[7]);
			
			String str=null;
			System.out.println(str.length());
			
		}catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}
