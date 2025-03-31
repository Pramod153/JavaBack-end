package com.collection.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// comparable, comparator

class Product{
	private int ProductId;
	private String ProductName;
	private int ProductRating;
	public Product(int productId, String productName, int productRating) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductRating = productRating;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductRating() {
		return ProductRating;
	}
	public void setProductRating(int productRating) {
		ProductRating = productRating;
	}
	@Override
	public String toString() {
		return "Product [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductRating=" + ProductRating
				+ "]";
	}
	public int compareTo(Product1 o1) {
//		return this.getProductId()- o.productId;
//		return this.getProductName().compareTo(o.getProductName());
		return o1.getProductName().compareTo(o1.getProductName());
	}
		
	
}
public class Test2 {

	public static void main(String[] args) {
		
//		Product p1= new Product(103,"Laptop",5);
		Product p2= new Product(105,"Desktop",2);
		Product p3= new Product(101,"Tablets",3);
		Product p4= new Product(102,"Mobiles",1);
//		Product p5= new Product(104,"Watches",4);
		List<Product> products = Arrays.asList(p1,p2,p3,p4,p5);
		System.out.println(products);
		System.out.println("............");
//		Collections.sort(products);
		System.out.println(products);
	}

}
