package com.collection.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	private int EmployeeId;
	private String EmployeeName;
	private int EmpSalary;
	public Employee(int employeeId, String employeeName, int empSalary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmpSalary = empSalary;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmpSalary() {
		return EmpSalary;
	}
	public void setEmpSalary(int empSalary) {
		EmpSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmpSalary=" + EmpSalary
				+ "]";
	}
	
}
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo( o2.getEmployeeName());
	}

	
	
		
}
	


	

class SortById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeId() - o2.getEmployeeId();
	}
	
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"harsh",101);
		
		Employee e2 = new Employee(2,"amit",103);
		Employee e3 = new Employee(5,"varun",102);
		Employee e4 = new Employee(4,"vivek",105);
		Employee e5 = new Employee(3,"arun",104);
		List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
		Collections.sort(employees, new SortById());
		System.out.println(employees);
		Collections.sort(employees, new SortByName());
		System.out.println(employees
				);
	}

}
