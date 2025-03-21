package com.aggregation;

 abstract class Employee{
	 
	 public final int data=12;
	 public int data2=20;
	 
	 
	public abstract String getType();
	Employee(){
		System.out.println("constructor called from abstract class");
	}
	public  final static void getCompany() {
		
		System.out.println("ABC");
	}
	public int getBaseSalary() {
		return 500;
	}
		
}
  class FTE extends Employee{
	  int data=100;
	  int data2=200;
	@Override
	public String getType() {
		
		return "FTE";
	}
	  
  }
  class PTE extends Employee{

		@Override
		public String getType() {
			
			return "PTE";
		}
		  
	  }

public class AbstractMethod {

	public static void main(String[] args) {
		Employee e1= new PTE();
		
		if(e1.getType().equals("FTE")) {
			System.out.println(e1.getBaseSalary()*1000);
		}else {
			System.out.println(e1.getBaseSalary()*500);
		}
		System.out.println(e1.data+""+e1.data2);
	}

}
//constructor cannot be declared as abstract and static and 
// final keyword is also doesnt allow bcz of override.
