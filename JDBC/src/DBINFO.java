package com.learning.JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DBINFO {
	
	public static void getDBinfo() throws SQLException {
		Connection con = DBConfiguration.getDbConnection();
		DatabaseMetaData metaData = con.getMetaData();
		System.out.println("Product Name: "+metaData.getDatabaseProductName());
		System.out.println("Product Version: "+metaData.getDatabaseProductVersion());
		System.out.println("UserName : "+metaData.getUserName());
		System.out.println("Driver Name : "+metaData.getDriverName());
		System.out.println("DriverVersion: "+metaData.getDriverVersion());
		
		
	}
	
	public static void getTableInfo() throws SQLException {
		String sql = "select * from product";
		Connection con = DBConfiguration.getDbConnection();
		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery(sql);
		ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
		System.out.println("DriverVersion: "+metaData.getTableName(1));
	}

	public static void main(String[] args) throws SQLException {
//		getDBinfo();
		getTableInfo();
	}
	

}
