package com.hibernate.mapping_II;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test1 {

	public static void main(String[] args) {
		Department d1= new Department();
		d1.setDeptName("CSE");
		
		Department d2= new Department();
		d2.setDeptName("ECE");
		
		Student s1 = new Student();
		s1.setStudentName("harsh");
		Student s2 = new Student();
		s2.setStudentName("arsh");
		Student s3 = new Student();
		s3.setStudentName("harish");
		Student s4 = new Student();
		s4.setStudentName("harsha");
		Student s5 = new Student();
		s5.setStudentName("harsith");
		Student s6 = new Student();
		s6.setStudentName("harishesh");
		
		List<Student> list1 =Arrays.asList(s1,s2,s3,s4);
		List<Student> list2 =Arrays.asList(s5,s6);
		
		d1.setStudents(list1);
		d2.setStudents(list2);
		
		s1.setDepartment(d1);
		s2.setDepartment(d1);
		s3.setDepartment(d1);
		s4.setDepartment(d1);
		s5.setDepartment(d2);
		s6.setDepartment(d2);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(d1);
		session.save(d2);
		session.getTransaction().commit();
		session.close();
		System.out.println("Object saved succesfully");
		
	}
		

}
