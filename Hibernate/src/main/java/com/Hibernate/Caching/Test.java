package com.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {

	public static void main(String[] args) {
		Book b = new Book();
		b.setBookName("java");
		Book b1 = new Book();
		b1.setBookName("python");
		
		
//		List<Product> list= Arrays.asList(p1,p2);
//		user.setProduct(list);
//		
//		p1.setUser(user);
//		p2.setUser(user);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(b);
        session.save(b1);
        session.getTransaction().commit();
        session.close();

	}

}
