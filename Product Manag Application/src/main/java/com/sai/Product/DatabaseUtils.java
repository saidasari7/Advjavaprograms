package com.sai.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseUtils {

	
	public static Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sai","welcome");
		}
		catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return connection;

}
}

