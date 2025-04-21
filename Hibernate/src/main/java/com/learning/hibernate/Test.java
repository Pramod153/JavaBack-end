package com.learning.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args){
		
//		Book b = new Book(103,"let us c", "yashwant kanetkar");
		Product p= new Product();
		p.setProductName("laptop");
		
		// Configuration object
		Configuration configuration = new Configuration();
		
		// session-factory object
		SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		
		//session object
		Session session =factory.openSession();
		
		//Transaction object
		session.beginTransaction();
		
		session.save(p);
//		session.save(b);
		session.getTransaction().commit();
		
		session.close();
		factory.close();
		
	}

}
