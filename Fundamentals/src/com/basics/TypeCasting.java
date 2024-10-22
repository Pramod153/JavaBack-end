package com.basics;

public class TypeCasting {
	static object obj;
	public static void main(String[] args) {
		//implicit
		byte a=10;
		short b= a;
		System.out.println(a+" "+b);
		
		//explicit
		int x=234;
		byte y=(byte)x;
		System.out.println(x+" "+y);
		
		// creating object
		TypeCasting typecasting = new TypeCasting();
		obj = typecasting ;
	}

}
