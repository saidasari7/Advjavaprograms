package com.sai.Servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThiredServlet")
public class ThiredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		long Mobile =Long.parseLong(request.getParameter("Modile"));
		
		HttpSession session =request.getSession(false);
		
		session.setAttribute("email",email);
		session.setAttribute("Modile",Mobile);
		
		response.setContentType("text/html");
	       PrintWriter writer=response.getWriter();
	       
	       writer.println("<html>");
	       writer.println("<body bgcolor='pink'>");
	        writer.println("<pre>");
	        writer.println("User Name:"+session.getAttribute("username"));
	        writer.println("User Age:"+session.getAttribute("age"));
	        writer.println("User qualification:"+session.getAttribute("qualification"));
	        writer.println("User designation:"+ session.getAttribute("designation"));
	        writer.println("User Email:"+request.getParameter("email"));
	        writer.println("Mobile Number:"+request.getParameter("Modile"));
		       
	        
	        writer.println("</pre>");
		       
	        writer.println("</body>");
	        writer.println("</html>");

            
	}

}
