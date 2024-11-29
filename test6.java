package com.control_statements;

import java.util.Scanner;

public class test6 {
	public static void number(int n1,int n2) {
		if(n1>n2) {
			System.out.println("n1 is greater than n2");
		}
		else {
			System.out.println("n1 is lesser than n2 ");
		}
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a n1 value");
	int n1 = sc.nextInt();
	System.out.println("enter a n2 value");
	int n2 = sc.nextInt();
	test6 e= new test6();
	e.number(n1,n2);
	
	}
}
