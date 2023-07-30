package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepostAmount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {		    
	        Connection con = ConnectionPro.getConnection();
	        
	        String query = "UPDATE table1 SET balance = balance + ? WHERE id = ?";
	        PreparedStatement pstmt = con.prepareStatement(query);
	        
	        System.out.println("Enter your amount");
	        int amount = sc.nextInt();
	        
	        System.out.println("Enter your id");
	        int id = sc.nextInt();
	        
	        pstmt.setInt(1, amount);
	        pstmt.setInt(2, id);
	
	        int r = pstmt.executeUpdate();

	        if (r > 0) {
	            System.out.println("***** Your Deposit successful *****.");
	        } else {
	            System.out.println("Deposit failed. Please check the account number and try again.");
	        }
	        con.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

}
