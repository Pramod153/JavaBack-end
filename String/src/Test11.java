package com.StringAssignments;
//Remove spaces from a string

import java.util.Scanner;

public class Test11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Using nextLine to handle spaces
        String result = str.replace(" ", " ");

        System.out.println("String without spaces: " + result);
        sc.close();
    }
}

