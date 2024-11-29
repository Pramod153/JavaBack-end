package com.control_statements;


	

	import java.util.Scanner;


	public class test1 {
		public static void number(int n) {
			if(-(n-1)==0) {
				System.out.println("it is positive number");
			}
			else {
				System.out.println("it is negative number");
			}
		}
		public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a n value");
		int n = sc.nextInt();
		test1 e= new test1();
		e.number(n);
		
		}

	}



