
package com.sai.jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class ProductDao {
	
	public int createProductTable() throws SQLException 
    {
     //Declare the resources
     Connection connection = null;
     PreparedStatement preparedStatement = null;
     int count = 0;
     
     try
  {
   //get the connection
   connection = DataBaseConnection.createConnection();
  
   //create the prepared statement Object
   preparedStatement = connection.prepareStatement("CREATE TABLE Product1(proId INT PRIMARY KEY, proName VARCHAR(255), proPrice Double");
   
   count = preparedStatement.executeUpdate();
  }
  catch(SQLException e)
  {
   e.printStackTrace();
  }
     finally
  {
   //Before release connection check the connection present or not
   if(connection != null)
    connection.close();
   if(preparedStatement != null)
    preparedStatement.close();
  }
  return count;
    }
    public int save(product1 pro) throws SQLException
 {
  //Declare the resources
  Connection connection = null;
  PreparedStatement preparedStatement = null;
  int count = 0;
 
  try
  {
   //get the connection
   connection = DataBaseConnection.createConnection();
  
   //create the prepared statement Object
   preparedStatement = connection.prepareStatement("insert into Product1 values(?,?,?)");
   
   //Read the data from employee object and set to parameters
   preparedStatement.setInt(1,pro.getProId());
   preparedStatement.setString(2,pro.getProName());
   preparedStatement.setDouble(3,pro.getProPrice());
   
   count = preparedStatement.executeUpdate();
  }
  catch(SQLException e)
  {
   e.printStackTrace();
  }
  finally
  {
   //Before release connection check the connection present or not
   if(connection != null)
    connection.close();
   if(preparedStatement != null)
    preparedStatement.close();
  }
  return count;
 }
    public static product1 getProductById(int proId) throws SQLException
 {
    	product1 product = null;
  
  //try-with the resources: once the try block is completed try resources automatically closed
  try(Connection connection = DataBaseConnection.createConnection();
    PreparedStatement preparedStatement = connection.prepareStatement("select * from Product1 where proId=?"))
  {
   //set the data to parameter
   preparedStatement.setInt(1,proId);
   
   //Execute the query
   ResultSet resultset = preparedStatement.executeQuery();
   
   //if the record is present execute below code, if the record is not present return null
   if(resultset.next())
   {
    //Reading the data from the result set setting to employee
    product = new product1();
    product.setProId(resultset.getInt(1));
    product.setProName(resultset.getString(2));
    product.setProPrice(resultset.getDouble(3));
   }
  }
  catch(SQLException e)
  {
   e.printStackTrace();
  }
  return product;
 }
    public  static List<product1> getAllProducts() throws SQLException
 {
  List<product1> pro = new ArrayList<product1>();
  try(Connection connection = DataBaseConnection.createConnection();
    Statement statement = connection.createStatement())
  {
   ResultSet resultset = statement.executeQuery("select * from Product1");
   
   while(resultset.next())
   {
	   product1 product =  new product1();
    
    product.setProId(resultset.getInt(1));
    product.setProName(resultset.getString(2));
    product.setProPrice(resultset.getDouble(3));
    pro.add(product);
   }
  }
  catch(SQLException e)
  {
   e.printStackTrace();
  }
  return pro;
 }
    public static int Updateprice(double currentprice,double incprice)
    {
    	int updatecount=0;
    	try(Connection connection = DataBaseConnection.createConnection(); 
    	PreparedStatement preparedStatement = connection.prepareStatement("Update Product1 set proprice =proprice+? where proprice>=?"))
    	{
    		
    	preparedStatement.setDouble(1,incprice);
       preparedStatement.setDouble(2,currentprice);
       
       updatecount =preparedStatement.executeUpdate();
       System.out.println("price update successfully");
    	}
     catch(SQLException e)
    	{
    	 e.printStackTrace();
    	}
    	return updatecount;
}
    public static int deleteProductById(int proId) throws SQLException {
        // Declare the resources
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;

        try {
            // Get the connection
            connection = DataBaseConnection.createConnection();

            // Create the prepared statement Object
            preparedStatement = connection.prepareStatement("DELETE FROM Product1 WHERE proId=?");

            // Set the parameter
            preparedStatement.setInt(1, proId);

            // Execute the update
            count = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Before releasing connection, check if the connection is present or not
            if (connection != null)
                connection.close();
            if (preparedStatement != null)
                preparedStatement.close();
        }
      
 return count;
    }
    public static int deleteProductsByPriceRange(double minPrice, double maxPrice) throws SQLException {
        // Declare the resources
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int count = 0;

        try {
            // Get the connection
            connection = DataBaseConnection.createConnection();

            // Create the prepared statement Object
            preparedStatement = connection.prepareStatement("DELETE FROM Product1 WHERE proPrice BETWEEN ? AND ?");

            // Set the parameters
            preparedStatement.setDouble(1, minPrice);
            preparedStatement.setDouble(2, maxPrice);

            // Execute the update
            count = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Before releasing connection, check if the connection is present or not
            if (connection != null)
                connection.close();
            if (preparedStatement != null)
                preparedStatement.close();
        }
        return count;
    }
	
	}



