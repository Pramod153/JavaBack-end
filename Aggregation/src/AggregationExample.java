package com.aggregation;

import java.util.Arrays;
import java.util.List;

class College{
	private String CollegeName;
	private List<Department>department;
	
	
	
	public College(String collegeName) {
		super();
		this.CollegeName = collegeName;
	}


	


	public String getCollegeName() {
		return CollegeName;
	}





	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}





	public List<Department> getDepartment() {
		return department;
	}





	public void setDepartment(List<Department> department) {
		this.department = department;
	}





	public int getTotalStudents() {
		int count=0;
		for(Department d: getDepartment()) {
			for (StudentData s: d.getStudent()) {
				System.out.println(s.getStudentName());
				count++;
			}
		}
		return count;
	}

	
}

class Department{

	private String deptName;
	private List<StudentData> student;
	public Department(String deptName) {
		super();
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<StudentData> getStudent() {
		return student;
	}
	public void setStudent(List<StudentData> student) {
		this.student = student;
	}
}
class StudentData{
	
	private int studenId;
	private String StudentName;
	
	
	public StudentData(int studenId, String studentName) {
		super();
		this.studenId = studenId;
		this.StudentName = studentName;
	}


	public int getStudenId() {
		return studenId;
	}


	public void setStudenId(int studenId) {
		this.studenId = studenId;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
		
	
}

public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentData s1= new StudentData(101,"harsh");
		StudentData s2= new StudentData(102,"ankit");
		StudentData s3= new StudentData(103,"gautam");
		StudentData s4= new StudentData(104,"yogesh");
		StudentData s5= new StudentData(105,"john");
		StudentData s6= new StudentData(106,"anamika");
		StudentData s7= new StudentData(107,"anurag");
		
		Department d1= new Department("CSE");
		Department d2= new Department("ECE");
		
		List<StudentData> cseStudent = Arrays.asList(s1,s2,s3);
		List<StudentData> eceStudent = Arrays.asList(s4,s5,s6,s7);
		
		d1.setStudent(cseStudent);
		d2.setStudent(eceStudent);
		
		College c=new College("kle college");
		List<Department> departments = Arrays.asList(d1,d2);
		c.setDepartment(departments);
		
		System.out.println(c.getTotalStudents());
		
		
	}

}
