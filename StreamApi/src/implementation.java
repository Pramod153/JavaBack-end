package com.streamAPI;


@FunctionalInterface
interface A{
//	void doSomething(); // only one abstract method
//	void doSomething(String a);
	String doSomething(String a);
	
}
//class AImpl implements A{
//
//	@Override
//	public void doSomething() {
//
//		System.out.println("do something");
//		
//	}
//	
//}
public class implementation {

	public static void main(String[] args) {
//		A obj = new AImpl();
//		obj.doSomething();
//		A obj = ()->{System.out.println("do something");};
//		obj.doSomething();
		
//		A obj = (a)->{System.out.println("do something "+a);};
//		obj.doSomething("coding");
		
		A obj = (a)->{return a.toUpperCase();};
		System.out.println(obj.doSomething("coding"));
	}
}
