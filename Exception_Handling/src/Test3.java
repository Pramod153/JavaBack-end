package com.ExceptionHandling;

public class Test3 {
	
		public static void m1(int a,int b) {
			try {
				int result =a/b;
				System.out.println("after risky code");
			}catch(Exception e) {
//				e.printStackTrace();
				System.out.println("exception handled inside catch block");
			}
			System.out.println("out of try catch");
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			m1(12,0);
	}

}
