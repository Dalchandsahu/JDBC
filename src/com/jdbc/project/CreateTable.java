package com.jdbc.project;

import java.sql.*;

public class CreateTable {
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
			String q ="create table Table1(id int(20) primary key auto_increment, name varchar(50), Address varchar(200), phone varchar(10))";
			
			// create a Statement
			
			Statement stmt  = con.createStatement();
			stmt.executeUpdate(q);
			
			System.out.println("Table created Successfully***");
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
