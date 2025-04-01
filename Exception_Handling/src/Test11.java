package com.ExceptionHandling;

public class Test11 {
	
	public static void getResult(int a,int b) {
		if(b==0) {
			try{
			throw new Exception("b should have greater than one");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
	
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
		getResult(12,0);
	}

}
