package com.StringAssignments;
//Remove brackets from an algebraic expression

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an algebraic expression: ");
        String str = sc.nextLine();
        String result = str.replaceAll("[(){}\\[\\]]", "");

        System.out.println("Expression without brackets: " + result);
        sc.close();
    }
}

