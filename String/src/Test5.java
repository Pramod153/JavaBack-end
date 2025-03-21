package com.StringAssignments;
//Toggle each character in a string
import java.util.Scanner;

public class Test5 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.next();
	        StringBuilder toggled = new StringBuilder();

	        for (char c : str.toCharArray()) {
	            if (Character.isLowerCase(c)) {
	                toggled.append(Character.toUpperCase(c));
	            } else if (Character.isUpperCase(c)) {
	                toggled.append(Character.toLowerCase(c));
	            } else {
	                toggled.append(c);
	            }
	        }
	        System.out.println("Toggled string: " + toggled);
	        sc.close();
	    }
	}

