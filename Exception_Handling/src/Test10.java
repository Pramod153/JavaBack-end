package com.ExceptionHandling;

public class Test10 {
	public static void m1() {
		try {
			int result =12/0;
			System.out.println(result);
			
		}catch(Exception e){
			System.out.println("exception handled");
			System.exit(0);
			
		}
		finally {
			System.out.println("code executed");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

}

//if the return stmt is called inside the finally block the result will be  thet return statement result bcz of overlapping.