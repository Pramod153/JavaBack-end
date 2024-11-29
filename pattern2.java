package com.control_statements;

public class pattern2 {
	public static void pattern(int n) {
		for(int i=n;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=n-i;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
   
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
		pattern(5);
	 }
    

}
