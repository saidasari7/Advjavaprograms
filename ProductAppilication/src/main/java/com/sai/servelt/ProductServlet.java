package com.sai.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		

		
		//step:1 Read the data
		int Proid = Integer.parseInt(request.getParameter("ProId"));
		String Proname = request.getParameter("Proname");
		double ProPrice = Double.parseDouble(request.getParameter("ProPrice"));
		int Proquantity = Integer.parseInt(request.getParameter("Proquantity"));
		
		//step:2 Process the data
		double totalprice = ProPrice*Proquantity;
		double discount=0;
		
		if(totalprice >=1000 && totalprice <=5000)
		{
			discount = 0.05;
		}
		else if(totalprice >=5000  && totalprice <=10000)
		{
			discount = 0.1;
		}
		else if(totalprice < 1000)
		{
			discount=1;
		}
		else
		{
			discount = 0.15;
		}
		double discountedAmount = totalprice * discount;
		double TotalBillAmount = totalprice - discountedAmount;
		
		//Step:3 Render the response data
		response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Bill Invoice...</h1>");
        writer.println("<style>");
        writer.println("body { background-color: #FFCOCB; }");
        writer.println("</style>");
        writer.println("<p>Product Id: " + Proid + "</p>");
        writer.println("<p>Product Name: " + Proname + "</p>");
        writer.println("<p>Product Price: " + ProPrice + "</p>");
        writer.println("<p>Product Quantity: " + Proquantity + "</p>");
        writer.println("<p>Discount Amount:" + discountedAmount +"</p>");
        writer.println("<p>Total Bill Amount: " + TotalBillAmount + "</p>");
        writer.println("</body>");
        writer.println("</html>");
		
	}
}
	

