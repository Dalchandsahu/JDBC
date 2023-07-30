package com.jdbc.project;

import java.sql.*;
import java.util.Scanner;

public class Find_DetailsOneByOne {
	
	
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			Connection con  = ConnectionPro.getConnection();
			
			String q ="select *from table1 where id = ?";
			
			
			System.out.println("Enter your id");
			int ids = sc.nextInt();
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, ids);
			
			ResultSet set = ps.executeQuery();
			
			if(set.next()) { 
				int id  =set.getInt(1);
				String name = set.getString(2);
				String Address = set.getString(3);
				String phone = set.getString(4);
				int balance = set.getInt(5);
				System.out.println("[ "+ id +", "+ name +", "+ Address +", "+ phone + ", " + balance+"]");
			} else {
			System.out.println("wrong Id");
			}
			
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}
