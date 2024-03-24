package com.sai.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class producttableCreated {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	 {
	  //step:1 Load the driver
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  System.out.println("Driver loaded successfully....");
	  
	  //step:2 Create the connection
	  Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sai","welcome");
	  
	  //step:3 static query execution
	  Statement statement = connection.createStatement();
	  
	  String pro = "create table Product1(proId number, proName varchar2(30), proPrice number)";
	  int res1 = statement.executeUpdate(pro);
	  System.out.println("Table Created Successfully..."+res1);
	  
	  
	  
	}

}
