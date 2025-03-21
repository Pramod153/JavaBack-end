package com.StringAssignments;
//Check if two strings are Anagram or not

import java.util.Arrays;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.next();
        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Strings are anagrams.");
            } else {
                System.out.println("Not anagrams.");
            }
        }
        sc.close();
    }
}

