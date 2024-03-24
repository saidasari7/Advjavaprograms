package com.sathya.Servlrt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FullnameServlet")
public class FullNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
    		String firstName =request.getParameter("FirstName");
    		String middelName =request.getParameter("MiddelName");
    		String lastName=request.getParameter("LastName");
    		
    		String Status;
    		if(firstName.equals("sai")&&middelName.equals("dasari")&&lastName.equals("sai"))
    			
    		{
    			Status="Correct Name";
    		}
    		else
    		{
    			Status="Enter correct Name";
    		}
    		
    		response.setContentType("text/html");
    		PrintWriter Writer=response.getWriter();
    		
    		Writer.println("<html>");
    		Writer.println("<h1><i>Full Name...</h1>"+Status+" "+firstName+" "+middelName+" "+lastName);
    		
    		Writer.println("</html>");
    		
    		
    	}

}
