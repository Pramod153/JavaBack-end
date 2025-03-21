package com.StringAssignments;

//Print the given string in reverse order

import java.util.Scanner;

public class Test9 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = sc.next();
       String reversed = new StringBuilder(str).reverse().toString();

       System.out.println("Reversed string: " + reversed);
       sc.close();
   }
}

