package com.ExceptionHandling;

public class Test9 {
	
	public static int m1(int a,int b) {
		try {
			return a/b;
		}catch(Exception e) {
			return -1;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(m1(2,0));
	}

}
