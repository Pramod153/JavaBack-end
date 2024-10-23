package com.basics;

class Car{
	int data=100;//instance variable
	static int data2=200;// static variables
	
	public static void getData(Car obj) {
//		Car obj=new Car();
		System.out.println(Car.data2);
		System.out.println(obj.data);
		
	}
	public void getValue() {
		System.out.println(data);
		System.out.println(Car.data2);
		
	}
}
public class Method_2 {
		public static void main(String[] args) {
			
			Car obj=new Car();
			Car.getData(obj);
			
			
			
		}
}
