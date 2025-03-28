package com.learning.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Product{
	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		super();
	}
	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
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
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
}
class ProductUtil{
	private static Connection getConnection() {
		return  DBConfiguration.getDbConnection();
	}
	public static String addProduct(Product p) throws SQLException {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("insert into product values(?,?,?)");
		ps.setInt(1, p.getProductId());
		ps.setString(2, p.getProductName());
		ps.setDouble(3, p.getProductPrice());
		
		int row = ps.executeUpdate();
		if(row > 0)return " product inserted";
		return "insertion failed";
	}
	public static String UpdateProduct(int productId,Product p) throws SQLException {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("update product set productName =? , productPrice=?");
		ps.setString(1, p.getProductName());
		ps.setDouble(2, p.getProductPrice());
		ps.setInt(3, p.getProductId());
		
		int row = ps.executeUpdate();
		if(row > 0)return " product updated";
		return "product not found";
	}
	public static String deleteProduct(int ProductId) throws SQLException {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("delete from product where productId=?");
//		ps.setString(1, p.getProductName());
//		ps.setDouble(2, p.getProductPrice());
		ps.setInt(1, ProductId);
		
		int row = ps.executeUpdate();
		if(row > 0)return " product deleted";
		return "product not found";
	}
	public static void getProduct() throws SQLException {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("select* from product");
		ResultSet rs =ps.executeQuery();
		while(rs.next()) {
			System.out.println("ProductId "+rs.getInt(1));
			System.out.println("ProductName "+rs.getString(2));
			System.out.println("ProductPrice "+rs.getDouble(3));
		}
	}
	
	
	//calling stored procedure:
	public static void getData() throws SQLException {
		Connection con = getConnection();
		CallableStatement call=con.prepareCall("{call getProducts(?)}");
		call.setInt(1,89000);
		ResultSet rs =call.executeQuery();
		while(rs.next()) {
			System.out.println("ProductId "+rs.getInt(1));
			System.out.println("ProductName "+rs.getString(2));
			System.out.println("ProductPrice "+rs.getDouble(3));
		}
	}
	
}
public class PreparedStmt {

	public static void main(String[] args) throws SQLException {
//		Product p = new Product(101,"laptop",89000);
//		Product p2 = new Product(102,"Mobile",79000);
//		Product p3 = new Product(103,"Watches",30000);
//		Product p4 = new Product(104,"Tables",99000);
//		Product p5 = new Product(105,"TV",49000);
//	System.out.println(ProductUtil.addProduct(p2));
//	System.out.println(ProductUtil.addProduct(p3));
//	System.out.println(ProductUtil.addProduct(p4));
//	System.out.println(ProductUtil.addProduct(p5));
//	System.out.println(ProductUtil.addProduct(p6));
	
		Product p2 = new Product();	
		p2.setProductName("mobile");
		p2.setProductPrice(78000);
	System.out.println(ProductUtil.UpdateProduct(101,p2));
//		System.out.println(ProductUtil.deleteProduct(101));
		
//		ProductUtil.getProduct();
		
		ProductUtil.getData();
	}

}
