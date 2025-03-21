package com.association;



import java.util.ArrayList;
import java.util.List;

class student{
	private String studentname;
	private int studentid;
	private List<courses>Courses;

	public student(String studentname, int studentid) {
		super();
		this.studentname = studentname;
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public List<courses> getCourses() {
		return Courses;
	}
	public void setCourses(List<courses> courses) {
		Courses = courses;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	
}
class courses{
	private int courseid;
	private String coursename;
	private student Student;
	public student getStudent() {
		return Student;
	}
	public void setStudent(student student) {
		Student = student;
	}
	public courses(int courseid, String coursename) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
}
public class associationexample2 {

	public static void main(String[] args) {
		courses e1 = new courses(101,"Cs");
		courses e2 = new courses(102,"Bio");
		courses e3 = new courses(103,"Chemi");
		courses e4 = new courses(104,"Maths");
		List<courses>groupOfCourses=new ArrayList<>();
		groupOfCourses.add(e1);
		groupOfCourses.add(e2);
		groupOfCourses.add(e3);
		student s = new student("Shoba" , 101);
 s.setCourses(groupOfCourses);
	System.out.println("____");
 System.out.println("fetching the details");
	System.out.println(s.getCourses().get(0).getCoursename() +" " +"opted by"  +" "+s.getStudentname());
	System.out.println(s.getCourses().get(1).getCoursename() +" "  +"opted by" +" "+s.getStudentname());
	System.out.println(s.getCourses().get(2).getCoursename() +" " +"opted by" +" "+s.getStudentname());
	e1.setStudent(s);
	e2.setStudent(s);
	e3.setStudent(s);
	e4.setStudent(s);
	
	
	System.out.println("____");
	System.out.println("fetching the details of college using student object");
	System.out.println("course Name:" +e1.getCoursename() +", "+"student Name:" +e1.getStudent().getStudentname());
	System.out.println("course Name:" +e2.getCoursename() +", "+"student Name:" +e2.getStudent().getStudentname());
	System.out.println("course Name:" +e3.getCoursename() +", "+"student Name:" +e3.getStudent().getStudentname());
	System.out.println("course Name:" +e4.getCoursename() +", "+"student Name:" +e4.getStudent().getStudentname());

		

	}

}
