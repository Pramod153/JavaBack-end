package com.basics;

class Student{
	int studentId =101;//instance variable

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "]";
	}
	
	
	
}

public class Variable_1 {
	public static void main(String[] args) {
		Student s = new Student();//creating obj
		
		System.out.println(s.studentId);
		Student s2 = new Student();
		System.out.println(s2.studentId);
		
		System.out.println("___________________________________");
		System.out.println("after modification");
		s.studentId= 500;
		
		System.out.println(s.studentId);				
		System.out.println(s2.studentId);
		
	}
	

}
