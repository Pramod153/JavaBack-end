package com.control_statements;

import java.util.Scanner;

public class test7 {
	public static void number(int temp) {
		if(temp<20 ) {
			System.out.println("it is cold");
		}
		else if(temp==20 || temp==30) {
			System.out.println("it is warm");
		}
		else if(temp>30) {
			System.out.println("it is hot");
		}
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a temperature");
	int temp = sc.nextInt();
	
	test7 e= new test7();
	e.number(temp);
	
	}
}
