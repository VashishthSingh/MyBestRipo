package com.serpro.ServerProgram;

import com.cshttprequest.Readings;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Ripository1 {
	public static void getDataFromClient(String data) {
		Readings rea=JsonUtility.convertToJavaObject(s);
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=(Connection) DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/report?useSSL=false","root","password");     
			PreparedStatement stmt=(PreparedStatement) con.prepareStatement("insert into MyTable(ramUti,diskUti,cpuUti,readTime) values(?,?,?,?)");  
			stmt.setFloat(1,);
			stmt.setFloat(2,);
			stmt.setDouble(3,);
			stmt.setString(4,);
			stmt.executeUpdate();  
		}catch(Exception e){ 
			System.out.println(e);
		}  
	}
}
