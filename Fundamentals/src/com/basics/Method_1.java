package com.basics;

class EmployeeInfo
{
	public void  getEmployeeInfo() {
		System.out.println("no details available");
		
	}
	public static void getCompanyName() {
		System.out.println("no company found");
		
	}
	public String getEmployeeName(){
		return "Varun";      
	}
}

public class Method_1 {
	public static void name(String[] args) {
		EmployeeInfo emp = new EmployeeInfo();
		emp.getEmployeeInfo();
		
		EmployeeInfo.getCompanyName();
		
		//emp.getEmployeeName();// not get result
		String name = emp.getEmployeeName();
		System.out.println(name);
		
	}

}
