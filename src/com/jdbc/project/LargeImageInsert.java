package com.jdbc.project;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class LargeImageInsert {
	public static void main(String[] args) {
		try {
			Connection c = ConnectionPro.getConnection();
			
			String q = "Insert into table2(Image) Values(?)";
			
			PreparedStatement ps = c.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis = new FileInputStream(file);
			ps.setBinaryStream(1, fis, fis.available());
			
			ps.executeUpdate();
			
			
			JOptionPane.showMessageDialog(null, "successfully Uploaded");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
