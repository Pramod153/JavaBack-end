package com.control_statements;

import java.util.Scanner;

public class test8 {
	public static void rectangle(int l,int b) {
		if(l==b) {
			System.out.println("The rectangle is square");
		}else {
			System.out.println("the rectangle is not square");
		}
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		int l =sc.nextInt();
		System.out.println("enter the breadth of rectangle");
		int b=sc.nextInt();
		
		test8 r = new test8();
		r.rectangle(l, b);
		
	}

}
