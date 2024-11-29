package com.control_statements;

import java.util.Scanner;

public class test9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a quantity");
		
		int q =sc.nextInt();
		int u = 100;
		int tc=q*u;
		if(tc>1000) {
			tc=tc-(tc*10/100);
			
		}
		System.out.println("toatl cost is "+tc);
	}
	

}
