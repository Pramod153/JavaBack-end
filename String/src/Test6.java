package com.StringAssignments;
//Count the number of vowels

	import java.util.Scanner;

	public class Test6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.next();
	        int count = 0;

	        for (char c : str.toCharArray()) {
	            if ("AEIOUaeiou".indexOf(c) != -1) {
	                count++;
	            }
	        }
	        System.out.println("Number of vowels: " + count);
	        sc.close();
	    }
	}


