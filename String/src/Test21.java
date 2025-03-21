package com.StringAssignments;
//Check if two strings match where one string contains wildcard characters

import java.util.Scanner;

public class Test21 {
    public static boolean isMatch(String str, String pattern) {
        if (pattern.isEmpty()) {
            return str.isEmpty();
        }

        boolean firstMatch = (!str.isEmpty() &&
                (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '?'));

        if (pattern.charAt(0) == '*') {
            return (isMatch(str, pattern.substring(1)) || (!str.isEmpty() && isMatch(str.substring(1), pattern)));
        } else {
            return firstMatch && isMatch(str.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter the pattern (use * and ? as wildcards): ");
        String pattern = sc.next();

        if (isMatch(str, pattern)) {
            System.out.println("Pattern matches the string.");
        } else {
            System.out.println("Pattern does not match the string.");
        }
        sc.close();
    }
}
