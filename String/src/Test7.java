package com.StringAssignments;
//Remove the vowels from a String
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1) {
                result.append(c);
            }
        }
        System.out.println("String without vowels: " + result);
        sc.close();
    }
}


