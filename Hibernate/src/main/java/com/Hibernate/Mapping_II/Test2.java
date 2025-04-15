package com.hibernate.mapping_II;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Department department =session.get(Department.class, 1);
		if(department!=null) {
			System.out.println(department.getDeptName());
			for(Student s:department.getStudents()) {
				System.out.println(s.getStudentName());
			}
		}
		
		System.out.println("--------------------------");
		Student student= session.get(Student.class, 3);
		if(student!=null) {
			System.out.println(student.getStudentName()+""+student.getDepartment().getDeptName());			
		}
		session.close();
		
	}

}
