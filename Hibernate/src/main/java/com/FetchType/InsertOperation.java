package com.FetchType;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertOperation {

	public static void main(String[] args) {
		User user = new User();
		user.setUserName("Harsh");
		
		Product p1= new Product();
		p1.setProductName("p1");
		
		Product p2= new Product();
		p1.setProductName("p2");
		
		List<Product> list= Arrays.asList(p1,p2);
		user.setProduct(list);
		
		p1.setUser(user);
		p2.setUser(user);
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        // Saving subjects (which will also save students due to cascading)
        session.save(user);
//        session.save(s12);

        session.getTransaction().commit();
        session.close();
	}
}
