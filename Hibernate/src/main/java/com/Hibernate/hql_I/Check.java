package com.hibernate.hql_I;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students();
		s1.setStudentName("ankush");
		
		Students s2 = new Students();
		s2.setStudentName("ravi");
		
		Students s3 = new Students();
		s3.setStudentName("praveen");
		
		Students s4 = new Students();
		s4.setStudentName("rahul");
		
//		System.out.println(StudentUtil.addStudent(s1));
//		System.out.println(StudentUtil.addStudent(s2));
//		System.out.println(StudentUtil.addStudent(s3));
//		System.out.println(StudentUtil.addStudent(s4));
		
		StudentUtil.getAllStudents();
//		StudentUtil.getStudentsById(1);
//		System.out.println(StudentUtil.UpdateStudent(3, "akash"));
//		System.out.println(StudentUtil.DeleteStudent(5));
	}

}
