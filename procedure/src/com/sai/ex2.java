package com.sai;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class ex2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","sai","welcome");
			//call the procedure
			CallableStatement callableStatement=connection.prepareCall("{call getDetails(?,?,?)}");
			// set the input data
			callableStatement.setInt(1,111);
			//register one variable to store the output
			callableStatement.registerOutParameter(2,Types.INTEGER);
			callableStatement.registerOutParameter(3,Types.VARCHAR);
			callableStatement.registerOutParameter(4,Types.FLOAT);
			//Execute the procedure the output will be store in registerParameter
			callableStatement.executeUpdate();
			//print the output
			System.out.println(callableStatement.getInt(2));
			System.out.println(callableStatement.getString(3));
			System.out.println(callableStatement.getFloat(4));


			connection.close();
		
	}

}