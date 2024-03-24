package com.sathya.jdbcEx2;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	
	public int save(Employee emp) throws SQLException
	 {
	  //Declare the resources
	  Connection connection = null;
	  PreparedStatement preparedStatement = null;
	  int count = 0;
	 
	  try
	  {
	   //get the connection
	   connection = DbConnection.createConnection();
	  
	   //create the prepared statement Object
	   preparedStatement = connection.prepareStatement("insert into emp values(?,?,?)");
	   
	   //Read the data from employee object and set to parameters
	   preparedStatement.setInt(1,emp.getEmpId());
	   preparedStatement.setString(2,emp.getEmpName());
	   preparedStatement.setDouble(3,emp.getEmpsalary());
	   
	   
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
	 public Employee findById(int empId) throws SQLException
	 {
	  Employee employee = null;
	  
	  //try-with the resources: once the try block is completed try resources automatically closed
	  try(Connection connection = DbConnection.createConnection();
	    PreparedStatement preparedStatement = connection.prepareStatement("select * from emp where empId=?"))
	  {
	   //set the data to parameter
	   preparedStatement.setInt(1,empId);
	   
	   //Execute the query
	   ResultSet resultset = preparedStatement.executeQuery();
	   
	   //if the record is present execute below code, if the record is not present return null
	   if(resultset.next())
	   {
	    //Reading the data from the result set setting to employee
	    employee = new Employee();
	    employee.setEmpId(resultset.getInt(1));
	    employee.setEmpName(resultset.getString(2));
	    employee.setEmpsalary(resultset.getDouble(3));
	   }
	  }
	  catch(SQLException e)
	  {
	   e.printStackTrace();
	  }
	  return employee;
	 }
	 public Employee DeleteById(int empId)
	 {
	  Employee employee = null;
	  int count = 0;
	  try(Connection connection = DbConnection.createConnection();
	    PreparedStatement preparedStatement = connection.prepareStatement("delete from emp where empId=?"))
	  {
	   preparedStatement.setInt(1,empId);
	   count = preparedStatement.executeUpdate();
	   if(count == 1)
	   {
	    System.out.println("Data deleted Succesfully...");
	   }
	   else
	   {
	    System.out.println("Data deletion failed...");
	   }
	  }
	  catch(SQLException e)
	  {
	   e.printStackTrace();
	  }
	  return employee;
	 }
	 public Employee DeleteBySalary(double salary)
	 {
	  Employee employee = null;
	  int count=0;
	  try(Connection connection = DbConnection.createConnection();
	    PreparedStatement preparedStatement = connection.prepareStatement("delete from emp where empSalary=?"))
	  {
		  preparedStatement.setDouble(1,salary);
	   count = preparedStatement.executeUpdate();
	   System.out.println("Salary deleted Succesfully..."+count);
	  }
	  catch(SQLException e)
	  {
	   e.printStackTrace();
	  }
	  return employee;
	  
	 }
	   public static List<Employee> findAll() throws SQLException
	    {
	    	//create the list of store the group records
	    	List<Employee> emps =new ArrayList<Employee>();
	    	
	    	try(Connection connection = DbConnection.createConnection();  
	    		 Statement statement = connection.createStatement())
	    	{
	    		ResultSet resultset =statement.executeQuery("select * from emp");
	    		while(resultset.next())
	    		{
	    			Employee employee =new Employee();
	    			
	    			employee.setEmpId(resultset.getInt(1));
	    			employee.setEmpName(resultset.getString(2));
	    			employee.setEmpsalary(resultset.getDouble(3));
	    			
	    		emps.add(employee);
	    		}
	    	}
	    	catch(SQLException e)
	    	{
	    		e.printStackTrace();
	    	}
	    	return emps;		 
	    }
        public int UpdateSalary(double currentSalary,double incSalary)
        {
        	int updatecount=0;
        	try(Connection connection = DbConnection.createConnection(); 
        	PreparedStatement preparedStatement = connection.prepareStatement("Update emp set empsalary =empsalary+? where empsalary>=?"))
        	{
        		
        	preparedStatement.setDouble(1,incSalary);
           preparedStatement.setDouble(2,currentSalary);
           
           updatecount =preparedStatement.executeUpdate();
           System.out.println("salary update successfully");
        	}
	     catch(SQLException e)
        	{
	    	 e.printStackTrace();
        	}
        	return updatecount;
	    }
}
        