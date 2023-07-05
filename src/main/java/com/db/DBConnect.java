package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	private static Connection conn;
	
	public static Connection getConn() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// replace password by the password set on your mysql workbench....
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", root, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
