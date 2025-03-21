package com.aggregation;

interface A{
	void m1();
}
interface B{
	void m1();
}
class C implements A,B{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1() called");
	}
	
}
public class MultiInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj= new C();
		obj.m1();
	}

}
