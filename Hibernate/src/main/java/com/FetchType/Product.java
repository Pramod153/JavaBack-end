package com.FetchType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProdutId;
	private String productName;
	@ManyToOne
	private User user;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProdutId() {
		return ProdutId;
	}
	public void setProdutId(int produtId) {
		ProdutId = produtId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
