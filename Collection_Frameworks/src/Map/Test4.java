
package com.collection.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Product1 implements Comparable<Product1>{
	private int productId;
	private int productRating;
	private String productName;
	public Product1(int productId, int productRating, String productName) {
		super();
		this.productId = productId;
		this.productRating = productRating;
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productRating=" + productRating + ", productName=" + productName
				+ "]";
		
	}
	@Override
	public int compareTo(Product1 o) {
//		return this.getProductId()- o.productId;
//		return this.getProductName().compareTo(o.getProductName());
		return o.getProductName().compareTo(this.getProductName());
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		Product1 p1 = new Product1(2,2,"Laptop");
		Product1 p2 = new Product1(3,3,"Laptop");
		Product1 p3 = new Product1(1,4,"Laptop");
		
		List<Product1> products = Arrays.asList(p1,p2,p3);
		System.out.println(products);
		
		System.out.println("-------------------");
		Collections.sort(products);
		System.out.println(products);
	}

}
