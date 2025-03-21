package com.StringAssignments;
//Capitalize the first and last character of each word in a string

import java.util.Scanner;

public class Test14 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = sc.nextLine();
       String[] words = str.split(" ");
       StringBuilder result = new StringBuilder();

       for (String word : words) {
           if (word.length() > 1) {
               result.append(Character.toUpperCase(word.charAt(0)))
                     .append(word.substring(1, word.length() - 1))
                     .append(Character.toUpperCase(word.charAt(word.length() - 1)))
                     .append(" ");
           } else {
               result.append(Character.toUpperCase(word.charAt(0))).append(" ");
           }
       }
       System.out.println("Capitalized string: " + result.toString().trim());
       sc.close();
   }
}

