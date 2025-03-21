package com.StringAssignments;
//Length of the string without using length() method

import java.util.Scanner;

	public class Test4 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.next();
	        int length = 0;

	        for (char c : str.toCharArray()) {
	            length++;
	        }
	        System.out.println("Length of the string: " + length);
	        sc.close();
	    }
}


