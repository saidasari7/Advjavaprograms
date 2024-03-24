package com.sathya.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcEx1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		
		//create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sai","welcome");
		System.out.println("connection created successfully");
		
		//Release the connection
		connection.close();
		System.out.println("Connection Closed Successfully");
		
	}

}
