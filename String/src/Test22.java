package com.StringAssignments;
//Print all permutations of a given string in lexicographically sorted order

import java.util.Arrays;
import java.util.Scanner;

public class Test22{
    public static void permute(String str, String result) {
        if (str.isEmpty()) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permute(rest, result + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = new String(arr);

        permute(str, "");
        sc.close();
    }
}

