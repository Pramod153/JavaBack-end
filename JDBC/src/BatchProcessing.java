package com.learning.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
	public static  void insertOperation() throws SQLException {
		String sql1 = "insert into product values (106,'A',78)";
		String sql2 = "insert into product values (107,'B',79)";
		String sql3 = "insert into product values (108,'C',80)";
		
		Connection con = DBConfiguration.getDbConnection();
		Statement stmt = con.createStatement();
		stmt.addBatch(sql1);
		stmt.addBatch(sql2);
		stmt.addBatch(sql3);
		int[] rows = stmt.executeBatch();
		System.out.println(rows.length);
	}
	public static void main(String[] args) throws SQLException {
		insertOperation();

	}

}
