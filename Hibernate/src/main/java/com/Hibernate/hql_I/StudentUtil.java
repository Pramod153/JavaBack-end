package com.hibernate.hql_I;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentUtil {
	private static SessionFactory factory=null;
	private static SessionFactory getFactory() {
		if(factory==null) {
			factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	public static String addStudent(Students s) {
		Session session = getFactory().openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		return " student added successfully";		
	}
	public static void getAllStudents() {
		Session session= getFactory().openSession();
		Query<Students> query = session.createQuery("from Students");
		List<Students>list=query.list();
		for(Students s:list) {
			System.out.println(s.getStudentName());
		}
		session.close();
	}
	public static void getStudentsById(int id) {
		Session session = getFactory().openSession();
		session.beginTransaction();
		Query<Students> query = session.createQuery("from Students where StudentId=:value");
		query.setInteger("value",id);
		Students student= query.uniqueResult();
		System.out.println(student.getStudentName());
		session.close();
	}
	public static String UpdateStudent(int id,String name) {
		Session session= getFactory().openSession();
		session.beginTransaction();
		Query<Students> query=session.createQuery("update Students set StudentName=:value where StudentId=:value2");
		query.setString("value",name);
		query.setInteger("value2", id);
		int Update=query.executeUpdate();
		session.getTransaction().commit();
		session.close();
		return " student updated succesfully";
	}
	public static String DeleteStudent(int id) {
		Session session=getFactory().openSession();
		session.beginTransaction();
		Query<Students> query=session.createQuery("delete from Students where STudentId=:value");
		query.setInteger("value", id);
		query.executeUpdate();
		session.getTransaction().commit();
		session.close();		
		return "student deleted succesfully";
	}
}
