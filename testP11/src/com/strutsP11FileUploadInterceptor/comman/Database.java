package com.strutsP11FileUploadInterceptor.comman;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	public static Connection conn = null;
	public static String 
			uri = "jdbc:mysql://localhost:3306/struts2",
			username = "root",
			password = "";
	public static Connection getDBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection( uri, username, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
