package com.hibernate.hql;



//import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

//import antlr.collections.List;

public class ProductUtil {
	private static SessionFactory factory=null;
	private static SessionFactory getFactory() {
		if(factory==null) {
			factory=new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
	
	public static String addProduct(Product p) {
		Session session =getFactory().openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
		session.close();
		return "product saved successfully";
	}
//	public static void getAllProduct() {
//		Session session =getFactory().openSession();
//		Query<Product> query = session.createQuery("from Product");
//		List<Product> list = query.lisst();
//		for(Product p:list) {
//			System.out.println(p.getProductName());
//		}
//		session.close();
//	}
//	public static void getProductById(int id) {
//		Session session = getFactory().openSession();
////		session.beginTransaction();
//		Query<Product> query = session.createQuery("from Product where ProductId =:value");
//		query.setInteger("value", id);
//		Product product= query.uniqueResult();
//		System.out.println(product.getProductName());
//		session.close();
//	}
//	public static String delteProduct(int id) {
//		Session session =getFactory().openSession();
//		session.beginTransaction();
//		Query<Product> query = session.createQuery("delete from Product where ProductId =:value ");
//		query.setInteger("value",id);
//		query.executeUpdate();
//		session.getTransaction().commit();
//		session.close();
//		return "Product delete succesfully";
//	}
//	
}
