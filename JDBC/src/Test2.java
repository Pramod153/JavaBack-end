package com.learning.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JdbcUnit{
	private static Statement getStatement() throws SQLException {
		return DBConfiguration.getDbConnection().createStatement();
	}
	public static String addProduct() throws SQLException {
		String sql="insert into product1 values(101,'laptop',87900)";
		Connection con = DBConfiguration.getDbConnection();
		Statement stmt = con.createStatement();
		int rows = getStatement().executeUpdate(sql);
		if(rows>0) {
			return "product added successfully";
		}
		return "insertion failed";
		
	}
	public static void getProduct() throws SQLException {
		String sql = "select * from product1";
		ResultSet rs = getStatement().executeQuery(sql);
		while(rs.next()) {
			System.out.println("ProductId "+rs.getInt(1));
			System.out.println("ProductName "+rs.getString(2));
			System.out.println("ProductPrice "+rs.getDouble(3));
		}
	}
	public static String updateProduct() throws SQLException {
		String sql = " update product1 set productPrice=92000 where productId=101";
		int row = getStatement().executeUpdate(sql);
		if(row>0) {
			return "updated";
			
		}return "Update failed";
	}
	public static String deleteProduct() throws SQLException {
		String sql = " delete from product1  where productId=101";
		int row = getStatement().executeUpdate(sql);
		if(row>0) {
			return "deleted";
			
		}return "deletion failed";
	}
}
public class Test2 {

	public static void main(String[] args) throws SQLException 
	{
		System.out.println(JdbcUnit.addProduct());
		JdbcUnit.getProduct();
		System.out.println(JdbcUnit.updateProduct());
		JdbcUnit.getProduct();
		System.out.println(JdbcUnit.deleteProduct());
		JdbcUnit.getProduct();
	}

}
