package com.ExceptionHandling;

public class Test2 {

	public static void main(String[] args) {
//		checked exception checked during compile time
		//sleep
//		Thread.sleep(1000);// interuppted Exception
//		Class.forName("com.mysql.cj.jdbc.Driver");//ClassNotFoundException
//		DriverManager.getConnection();// sql-exception

		
		
//		Unchecked exception checked during runtime time
//		System.out.println(12/0);//arithmetic exception
		String str=null;
//		System.out.println(str.length());//null pointer exception
		
		String str2="123abc";
//		System.out.println(Integer.parseInt(str2));// NumberFormatException
		
		int[]arr= {1,2,3};
//		System.out.println(arr[3]);//arrayindexoutofbound eception 
		
		String str3="java";
//		System.out.println(str3.charAt(5));//StringIndexOutOfBoundsException
		
	}

}
