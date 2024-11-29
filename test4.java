package com.control_statements;

import java.util.Scanner;


public class test4 {
	public static void number(int n) {
		if(n%2==0) {
			System.out.println("it is even number");
		}
		else {
			System.out.println("it is odd number");
		}
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a n value");
	int n = sc.nextInt();
	test4 e= new test4();
	e.number(n);
	
	}

}
