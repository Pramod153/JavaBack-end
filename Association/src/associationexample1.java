package com.association;


import java.util.ArrayList;
import java.util.List;

class Bank{
	private String bankname;
	private List<employee>Employee;
	public Bank(String bankname) {
		super();
		this.bankname = bankname;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public List<employee> getEmployee() {
		return Employee;
	}
	public void setEmployee(List<employee> employee) {
		Employee = employee;
	}
	
}
class employee{
	private int empid;
	private String empname;
	private Bank bank;
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

public class associationexample1 {

	public static void main(String[] args) {
		employee e1 = new employee(101,"harsh");
		employee e2 = new employee(102,"harshee");
		employee e3 = new employee(103,"harshi");
		employee e4 = new employee(104,"harsho");
		List<employee>groupOfEmployeee=new ArrayList<>();
		groupOfEmployeee.add(e1);
		groupOfEmployeee.add(e2);
		groupOfEmployeee.add(e3);
		 Bank b = new Bank("SBI");
		 b.setEmployee(groupOfEmployeee);
		 System.out.println("fetching the details");
	System.out.println("____");
	System.out.println(b.getEmployee().get(0).getEmpname() +" "+"works in"+" " +b.getBankname());
	System.out.println(b.getEmployee().get(1).getEmpname()+" "+"works in"+" " +b.getBankname());
	System.out.println(b.getEmployee().get(2).getEmpname()+" "+"works in"+" " +b.getBankname());
  
	e1.setBank(b);
	e2.setBank(b);
	e3.setBank(b);
	e4.setBank(b);
	
	System.out.println("____");
	System.out.println("fetching the details of bank using employee object");
	System.out.println("Emplyoee Name:" +e1.getEmpname() +", "+"Bank Name:" +e1.getBank().getBankname());
	System.out.println("Emplyoee Name:" +e2.getEmpname() +", "+"Bank Name:" +e2.getBank().getBankname());
	System.out.println("Emplyoee Name:" +e3.getEmpname() +", "+"Bank Name:" +e3.getBank().getBankname());
	System.out.println("Emplyoee Name:" +e4.getEmpname() +", "+"Bank Name:" +e4.getBank().getBankname());

		
		
		
		

	}

}

