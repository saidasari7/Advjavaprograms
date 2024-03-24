package com.Sai.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ClalculatorServlet")
public class ClalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    
		 //1 read the data;
		int num1 = Integer.parseInt(request.getParameter("First"));
		int num2 = Integer.parseInt(request.getParameter("Second"));
		String oparetion=request.getParameter("oparetion");

		//process the data
		
		int result=0;
		switch (oparetion)
		{
		case "+": result=num1+num2;
				break;
		case "-": result=num1-num2;
		       break;
		case "*": result=num1*num2;
		     break;
		case "/": result=num1/num2;
		        break;
		case "%": result=num1%num2;
		      break;
		}	
		     
		    //step3:Render the response
		     response.setContentType("text/html");
				PrintWriter writer=response.getWriter();
				writer.println("<html>");
					writer.println("<body>");
		        writer.println("<h2>Calculator Application:</h2>");
		        writer.println("<p>First Number:"+num1+"</p>");
		        writer.println("<p>Second Number:"+num2+"</p>");
		        writer.println("<p>your oparetion Symble: " +oparetion+ "</p>");
		        writer.println("<p>Your Result: " + result + "</p>");
		      
		        writer.println("</body></html>");

		
		
	}

}
