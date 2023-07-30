package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateJDBC {
	public static void main(String[] args) {
		try {
			Connection con = ConnectionPro.getConnection();
			String q ="update table1 set name = ? , Address = ?, phone = ? where id = ?";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter new name");
			String name = sc.nextLine();
			
			System.out.println("Enter your city");
			String city = sc.nextLine();
			
			System.out.println("Enter your phone no");
			String phone = sc.nextLine();
			
			System.out.println("Enter your Id");
			int id = sc.nextInt();
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, name);
			ps.setString(2, city);
			ps.setString(3, phone);
			
			ps.setInt(4, id);
			
			ps.executeUpdate();
			System.out.println("Update Successfully");
			con.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
