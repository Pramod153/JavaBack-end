package com.basics;

import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	char isActive;
	
	public void setDetails(int id, String name, char active) {
		empId=id;
		empName=name;
		isActive=active;
		
	}
	public void getDetails() {
		System.out.println("EmployeeId:"+empId+"EmployeeName:"+empName+"iaActive:"+isActive);
		
	}
	
}

public class Method_3 {
	
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the employeeId");
		int id =sc.nextInt();
		System.out.println("Is curent employee");
		char active =sc.next().charAt(0);
		System.out.println("enter the employeeId");
		String name= sc.next();
		
		Employee e= new Employee();
		e.setDetails(id,name,active);
		e.getDetails();
		
		
	}

}
