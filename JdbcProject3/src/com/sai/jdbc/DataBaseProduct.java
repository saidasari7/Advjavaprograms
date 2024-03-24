package com.sai.jdbc;

import java.sql.SQLException;
import java.util.List;

import javax.sql.StatementEvent;



public class DataBaseProduct {
	 @SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException
	 {
		 ProductDao productDao = new ProductDao();
	  int res1 = productDao.save(new product1(101,"mobilw",60000));
	  System.out.println("Data inserted Succesfully.."+res1);
	  
	  int res2 = productDao.save(new product1(102,"Laptop",52000));
	  System.out.println("Data inserted succesfully.."+res2);
	  
	  int res3 = productDao.save(new product1(103,"Ac",35000));
	  System.out.println("Data inserted Succesfully.."+res3);
	  
	  int res4 = productDao.save(new product1(104,"light",4000));
	  System.out.println("Data inserted Succesfully.."+res4);
	  
	  product1 product = ProductDao.getProductById(104);
	  System.out.println(product);
	  
	  List<product1> pros = ProductDao.getAllProducts();
	  for(product1 pro1 : pros)
	  {
	   System.out.println(pro1);
	  }
	  int updatecount=ProductDao.Updateprice(35000, 1000);
	    System.out.println(updatecount);
	    
	    int deletedCount = productDao.deleteProductById(101);
       // if (deletedCount > 0) {
            System.out.println("Product  deleted successfully.");
       // } else {
           // System.out.println("No product found with ID 104.");
       // }
            int deletedCoun = productDao.deleteProductsByPriceRange(40000, 100000); // Example price range
            System.out.println(deletedCount + " products deleted within the specified price range.");
	 }
	
	}