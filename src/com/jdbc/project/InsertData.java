package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		
	try {
		// load the driver 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Creating a connection
		String url = "jdbc:mysql://localhost:3306/students";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		// Create a Query
		String q ="insert into Table1(name, Address, phone) values(?, ?, ?)";
		
		// Insert Query in a Statement
		
		PreparedStatement ps = con.prepareStatement(q);
		
		// set values
		ps.setString(1, "Nilesh");
		ps.setString(2, "Bangluroo");
		ps.setInt(3, 887154889);
		
		ps.executeUpdate();
		
		System.out.println("Insert Successfully***");
		con.close();
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}

	
