package com.StringAssignments;
//Calculate frequency of characters in a string

import java.util.HashMap;
import java.util.Scanner;

public class Test15  {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String str = sc.next();
       HashMap<Character, Integer> frequency = new HashMap<>();

       for (char c : str.toCharArray()) {
           frequency.put(c, frequency.getOrDefault(c, 0) + 1);
       }

       System.out.println("Character frequencies: " + frequency);
       sc.close();
   }
}

