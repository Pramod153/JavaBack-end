package com.control_statements;

public class pattern1 {
	public static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=n;j<= i;j--) {
				System.out.print("*");
			}
//			for(int m=1;m<=n;i++) {
//				for(int j=1;j<=m;j++) {
//					System.out.print(" ");
//				}
//			}
//		for(int k=1;k<=i;k++) {
//			System.out.print("* ");
//		}
//		for(int m=2;m<=i;m++) {
//			System.out.print("* ");
//			
//		}
//////		for(int a=1;a<n;a++) {
////			System.out.println(" ");
////		}
//		for(int k=n;k>a;k--) {
//			System.out.println("* ");
//		}
//		for(int l=n-2;l>=a;l--) {
//			System.out.println("* ");
//		}
		System.out.println();
		}
	}
	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
//		pattern(5);
		pyramid(5);
	 }
    
}
         