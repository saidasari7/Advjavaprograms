package com.sai.Servlrt;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sai")
public class OnceMore extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter Writer=response.getWriter();
		
		Writer.println("<html>");
		Writer.println("<h1 style=\"color: red; background-color: black;\">welcom to Sathya</h1>");
		
		Writer.println("<h2 style=\"color: green;\">welcom to Servlet First Applications</h2>");
		Writer.println("<h3>welcom to Adv java class</h3>");
		Writer.println("<p1>course Full stack java</p1>");
		
		Writer.println("</html>");

	}

}
