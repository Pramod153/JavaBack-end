package com.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

class Student{
	private int studentId;
	private String studentName;
	private String deptName;
	public Student(int studentId, String studentName, String deptName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.deptName = deptName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", deptName=" + deptName + "]";
	}
	
}
class StudentNotFoundException extends Exception{
	private String msg;
	public StudentNotFoundException(String msg) {
		this.msg=msg;
	}
	public String getErrorMessage() {
		return this.msg;
	}
}

class StudentUtil{
	static List<Student> List = new ArrayList<>();
	 static {
		 Student s1= new Student(101,"harsh","ECE");
		 Student s2= new Student(102,"harish","CSE");
		 Student s3= new Student(103,"harsha","EEE");
		 Student s4= new Student(104,"arun","CSE");
		 Student s5= new Student(105,"varun","ECE");
		 
		 List.add(s1);
		 List.add(s2);
		 List.add(s3);
		 List.add(s4);
		 List.add(s5);
	 }
	 public static void findStudentById(int id) {
		 boolean found= false;
		 for(Student student:List) {
			 if(id== student.getStudentId()) {
				 System.out.println(student);
				 found=true;
				 return;
			 }
		 }
		 if(!found) {
			 try {
			 throw new StudentNotFoundException("Not Found");
			 }catch(StudentNotFoundException e) {
				 System.out.println(e.getErrorMessage());
			 }
		 }
	 }
	
}
public class Test12 {

	public static void main(String[] args) {
		StudentUtil.findStudentById(110);

	}

}
