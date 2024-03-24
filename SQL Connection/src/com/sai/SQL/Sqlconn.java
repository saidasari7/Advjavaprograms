package com.sai.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Sqlconn {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sai","root","welcome");
		  System.out.println("connection created with sql DataBase"); 
	 
		  PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
		  
		  preparedStatement.setInt(1,111);
		  preparedStatement.setString(2,"sai");
		  preparedStatement.setDouble(3,20000.00);
		  preparedStatement.addBatch();
		  
		  preparedStatement.setInt(1,112);
		  preparedStatement.setString(2,"ram");
		  preparedStatement.setDouble(3,400000);
		  preparedStatement.addBatch();
		  
		  preparedStatement.setInt(1,113);
		  preparedStatement.setString(2,"home");
		  preparedStatement.setDouble(3,500000);
		 
		  preparedStatement.executeBatch();
	connection.close();
	}

}
