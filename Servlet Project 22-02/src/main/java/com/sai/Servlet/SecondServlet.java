package com.sai.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String qualification= request.getParameter("Qualification");
		String designation= request.getParameter("Designation");
		
		HttpSession session =request.getSession(false);
		session.setAttribute("qualification",qualification);
		session.setAttribute("designation",designation);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("thired.html");
		dispatcher.forward(request, response);
	}

}
