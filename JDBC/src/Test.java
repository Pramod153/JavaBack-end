package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class DBConfiguration{
	private static final String url ="jdbc:mysql://localhost:3306/jdbc_learning";
	private static final String username ="root";
	private static final String password ="root";
	
	public static Connection getDbConnection() {
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(con==null) {
				con = DriverManager.getConnection(url,username,password);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void createTable() {
		try {
		String sql ="create table product3(productId int(20),productName varchar(20),productPrice decimal(10,2))";
		Connection con=getDbConnection();
		Statement stmt = con.createStatement();
		boolean execute = stmt.execute(sql);
		if(!execute)System.out.println("table created");
		else System.out.println("something went wrong");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
public class Test {

	public static void main(String[] args) {
//		System.out.println(DBConfiguration.getDbConnection());
		DBConfiguration.createTable();
	}

}
