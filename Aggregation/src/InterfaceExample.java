package com.aggregation;


interface AType{
	
	int data=12;// public static final;
	void m1();
	public static void m2() {
		System.out.println("static fn called");
	}
	public default void m3() {
		System.out.println("default method");
	}
	
}
interface BType{
	
}
interface CType extends AType,BType{
	
}
class ChildType implements AType{

	@Override
	public void m1() {
		System.out.println("method from child class");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
//		AType obj=new AType();
		System.out.println(AType.data);
//		AType.data=23;

	}

}
