package com.control_statements;
import java.util.Scanner;
public class AlternateSum {

  
    public static int Sum1(int[] arr, int index) {
       
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + Sum1(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = Sum1(arr, 0);
        System.out.println("Sum of alternate elements starting from index 1: " + result);
    }
}
