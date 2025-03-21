package com.StringAssignments;
//Count the sum of numbers in a string

import java.util.Scanner;

public class Test13{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = sc.next();
       int sum = 0;

       for (char c : str.toCharArray()) {
           if (Character.isDigit(c)) {
               sum += Character.getNumericValue(c);
           }
       }
       System.out.println("Sum of numbers in the string: " + sum);
       sc.close();
   }
}

