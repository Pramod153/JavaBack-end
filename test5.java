package com.control_statements;

import java.util.Scanner;

public class test5 {
	public static void character(char ch) {
		if( ch == 'a'|| ch =='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("it is vowel");
		}
		else {
			System.out.println("it is consonant");
		}
	}
	public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a ch value");
	char ch = sc.next().charAt(0);
	test5 e= new test5();
	e.character(ch);
	}
}
