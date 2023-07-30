package com.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;


public class UserInsertData {
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
			String q ="insert into Table1(name, Address, phone, balance) values(?,?,?,?)";
			
			// Insert data By the user in table.....
			
			PreparedStatement ps  = con.prepareStatement(q);
			// using Scanner class.....
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Your Name");
			String name =sc.nextLine();
			
			System.out.println("Enter Your Adrress");
			String Address = sc.nextLine();
			
			System.out.println("Enter Your Phone number");
			String Phone = sc.next();
			
			System.out.println("Enter your deposit amount");
			String balance = sc.next();
			
			ps.setString(1, name);
			ps.setString(2, Address);
			ps.setString(3, Phone);
			ps.setString(4, balance);
			
			ps.executeUpdate();
			System.out.println("Inser data Successfully***");
			
			ResultSet set = ps.executeQuery();
			int id  =set.getInt(1);
			System.out.println("Your Id is : "+ id);
			
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	}


