package com.StringAssignments;

//Check whether a character is a vowel or consonant

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Not an alphabet.");
        }
        sc.close();
    }
}


