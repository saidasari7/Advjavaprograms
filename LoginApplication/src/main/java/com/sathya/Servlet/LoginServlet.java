package com.sathya.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");

         String Status;
		
		if(username.equals("sai")&&password.equals("sai@7072"))
		{
			Status="Login successful...";
		}
		else
		{
			Status="Login fail...";
		}
		response.setContentType("text/html");
		PrintWriter Writer=response.getWriter();
		
		Writer.println("<html>");
		Writer.println("<h1>Login Status...</h1>"+Status);
		
		Writer.println("</html>");
		
	}

}
