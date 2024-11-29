package com.control_statements;

public class pattern3{
//	public static void pattern(int n) {
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(" * ");
//		}
//		System.out.println();
//	}
//}
	public static void pyramid(int n) {
		for(int i=1;i<=n;i++) {
			System.out.print(" ");
			for(int j=n ;j>i;j--) {
				System.out.print("  ");
			}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		for(int m=2;m<=i;m++) {
			System.out.print("* ");
			
		}
		System.out.println();
		}
		for(int a=1;a<n;a++) {
			System.out.print(" ");
			for(int j=1;j<=a;j++) {
				System.out.print("  ");
			}
			for(int k=n;k>a;k--) {
				System.out.print("* ");
			}
			for(int l=n-2;l>=a;l--) {
				System.out.print("* ");
			}
		
//		for(int i=1;i<=n;i--) {
//			for(int j=i;j<n;j--) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=(2*i-1);k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			for(int i=n-1;i>=1;i++) {
//				for(int j=n;j>i;j++) {
//					System.out.print(" ");
//				}
//				for(int k=1;k<=(2*i-1);k++) {
//					System.out.print("*");
////				}
		System.out.println();
		}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(5);
	}

}
