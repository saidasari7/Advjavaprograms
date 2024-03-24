package com.sathya.jdbcEx2;

import java.sql.SQLException;
import java.util.List;

public class DataBaseClient 
{
	

	 private static Employee[] emps;

	public static void main(String[] args) throws SQLException {
	   EmployeeDao employeeDao = new EmployeeDao();
	  int res1 = employeeDao.save(new Employee(111,"Rahul",500000));
	  System.out.println("Data inserted Succesfully.."+res1);
	  
	  int res2 = employeeDao.save(new Employee(112,"sai",200));
	  System.out.println("Data inserted succesfully.."+res2);
	  
	  /*int res3 = employeeDao.save(new Employee(113,"madhu",35000));
	  System.out.println("Data inserted Succesfully.."+res3);
	  
	  int res4 = employeeDao.save(new Employee(114,"ram",35000));
	  System.out.println("Data inserted Succesfully.."+res4);
	  
	  int res5 = employeeDao.save(new Employee(115,"Hey",65000));
	  System.out.println("Data inserted Succesfully.."+res5);

	  
	 /*Employee emp = employeeDao.findById(115);
	  System.out.println(emp);
	  
	  Employee emp2 = employeeDao.DeleteById(111);
	  System.out.println(emp2);
	  
	  Employee emp3 =employeeDao.DeleteBySalary(30000);
	  System.out.println(emp3);*/
	  
	  //List<Employee> emps =EmployeeDao.findAll();
	    //emps.forEach(emp->System.out.println(emp));
	    int updatecount=employeeDao.UpdateSalary(100, 10000);
	    System.out.println(updatecount);
	 }

	}