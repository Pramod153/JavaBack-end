package com.FetchType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadOperation {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        
        User user= session.get(User.class, 1);
        System.out.println(user.getUserName());
//        
//        for(Product p:user.getProduct()) {
//        	System.out.println(p.getProductName());
//        }

	}

}
