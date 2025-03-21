package com.StringAssignments;
//Replacing a particular word with another word in a string

import java.util.Scanner;

public class Test19 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the sentence: ");
       String sentence = sc.nextLine();
       System.out.print("Enter the word to replace: ");
       String wordToReplace = sc.next();
       System.out.print("Enter the replacement word: ");
       String replacementWord = sc.next();

       String result = sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
       System.out.println("Updated sentence: " + result);
       sc.close();
   }
}

