package com.ExceptionHandling;

public class Test13 {
	
	public static void m1() throws Exception{
		throw new StudentNotFoundException("Student not");
	}

	public static void main(String[] args) {
		
		try {
			m1();
		}catch(Exception e) {
			System.out.println("exception is handled");
		}
	}

}
