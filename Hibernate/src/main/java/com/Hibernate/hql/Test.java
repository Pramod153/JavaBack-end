package com.hibernate.hql;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product();
		p1.setProductName("mobile");
		
		Product p2= new Product();
		p2.setProductName("laptop");
		
		Product p3= new Product();
		p3.setProductName("tablet");
		
		System.out.println(ProductUtil.addProduct(p1));
//		System.out.println(ProductUtil.addProduct(p2));
//		System.out.println(ProductUtil.addProduct(p3));
		
//		ProductUtil.getAllProduct();
//		ProductUtil.getProductById(5);
//		System.out.println(ProductUtil.delteProduct(20));
//		

	}

}
