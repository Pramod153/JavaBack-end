package com.StringAssignments;
//Remove all characters from string except alphabets

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        System.out.println("String with only alphabets: " + result);
        sc.close();
    }
}
