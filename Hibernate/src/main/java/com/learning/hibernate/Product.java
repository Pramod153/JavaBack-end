package com.learning.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")  // Table name in DB
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ProductId;
	
	@Column(name = "Productname", nullable = false)
	private String ProductName;
	
	@Column(name = "Price")
	private String ProductPrice;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, String productPrice) {
		super();
		ProductId = productId;
		ProductName = productName;
		ProductPrice = productPrice;
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

//	public void setProductName(String productName) {
//		ProductName = productName;
//	}

	public String getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}

	public void setProductName(String productName) {
		// TODO Auto-generated method stub
		ProductName = productName;
	}

	
	
	
	
	
	
}
