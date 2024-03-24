package com.sai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Incomeservlet")
public class Incomeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String name=request.getParameter("Name");
		  int Age=Integer.parseInt(request.getParameter("Age"));
		  double Income=Double.parseDouble(request.getParameter("Income"));
		  String PanNumber=request.getParameter("PanNumber");
		  
		  String Status;
	      if(Income>=100000)
	      {
	    	  Status="yes";
	      }
	      else
	      {
	    	  Status="No";
	    	  
	      }
			 
	      
	      response.setContentType("text/html");
	      PrintWriter writer=response.getWriter();
	      
	      writer.println("html");	
	      writer.println("body");
	      writer.println("<p>Name:"+name+"<p>");
	      writer.println("<p>Age:"+Age+"<p>");
	      writer.println("<p>Income:"+Income+"<p>");  
	      writer.println("<p>Tax eliaible:"+Status+"<p>");

	      
	      writer.println("</body>");	
	      writer.println("</html>");	
	  
				  
	}

}
