package com.sathya.jdbcEx2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class jdbcex2 {
	
		
		 public static void main(String[] args) throws ClassNotFoundException, SQLException 
		 {
		  //step:1 Load the driver
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  System.out.println("Driver loaded successfully....");
		  
		  //step:2 Create the connection
		  Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sai","welcome");
		  
		  //step:3 static query execution
		  Statement statement = connection.createStatement();
		  
		  String q1 = "create table emp1(id number, name varchar2(30), salary number)";
		  int res1 = statement.executeUpdate(q1);
		  System.out.println("Table Created Successfully..."+res1);
		  
		  String q2 = "Drop table emp1";
		  int res2 = statement.executeUpdate(q2);
		  System.out.println("Table Droped successfully..."+res2);
		  
		  //step:4 Release the connection
		  connection.close();
		  System.out.println("Connection closed Successfully...");
		 }

		
}

		

	


