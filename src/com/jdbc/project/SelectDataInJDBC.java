package com.jdbc.project;

import java.sql.*;

public class SelectDataInJDBC {
	public static void main(String[] args) {
		
		
		try {
			Connection con  = ConnectionPro.getConnection();
			
			String q ="select *from table1";
			
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(q);
			
			while(set.next()) {
				int id =set.getInt(1);
				String name = set.getString(2);
				String Address = set.getString(3);
				String phone = set.getString(4);
				System.out.println(id +", "+ name +", "+ Address +", "+ phone);
			} 
			
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
