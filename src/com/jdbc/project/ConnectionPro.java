package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPro {
	private static Connection con;
	public static Connection getConnection() {
		
		try {
		if(con == null) {
			// load the driver 				
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/Students";
			String username = "root";
			String password = "root";
			
			con = DriverManager.getConnection(url, username, password);
						
						}
		}catch (Exception e) {
		  // TODO Auto-generated catch block
		  e.printStackTrace();
		}		
		return con;
	}

}
