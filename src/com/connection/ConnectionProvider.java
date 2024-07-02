package com.connection;

import java.sql.*;

public class ConnectionProvider {
	private static Connection con = null;
	static {
		try {
			String dbDriver = "com.mysql.jdbc.Driver"; 
	        String dbURL = "jdbc:mysql://localhost:3306/"; 
	        // Database name to access 
	        String dbName = "hms"; 
	        String dbUsername = "root"; 
	        String dbPassword = "20034"; 
	  
	        Class.forName(dbDriver); 
	        con = DriverManager.getConnection(dbURL+dbName,dbUsername,dbPassword); 
		} catch (Exception e) {
		}
	}

	public static Connection getCon() {
		return con;
	}
}
