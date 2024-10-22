package com.basics;

class Code{

	@Override
	public String toString() {
		return "custom object created";
	}
	
	
}
public class Test1 {
	public static void main(String[] args) {
		Code ob = new Code();
		System.out.println(ob);
		Code ob1 = new Code();
		System.out.println(ob1);
		
		
		System.out.println(ob.hashCode());
		
		//toString
		System.out.println(ob.toString());
	}

}
