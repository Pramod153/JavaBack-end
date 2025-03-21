package com.StringAssignments;
//Replace a sub-string in a string

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the sub-string to replace: ");
        String toReplace = sc.next();
        System.out.print("Enter the replacement string: ");
        String replacement = sc.next();

        String result = str.replace(toReplace, replacement);
        System.out.println("Updated string: " + result);
        sc.close();
    }
}

