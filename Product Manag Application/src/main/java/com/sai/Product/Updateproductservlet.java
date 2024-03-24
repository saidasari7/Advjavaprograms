package com.sai.Product;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/Updateproductservlet")
@MultipartConfig
public class Updateproductservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proId= request.getParameter("proId");
		String UpdatepoductName= request.getParameter("proName");
		double UpdatepoductPrice=Double.parseDouble(request.getParameter("proPrice"));
		String UpdatepoductBrand= request.getParameter("proBrand");
		String UpdatepoductMadeIn= request.getParameter("proMadeIn");
		Date UpdatepoductMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
		Date UpdatepoductExpDate=Date.valueOf(request.getParameter("proExpDate"));
	
		
		Product product=new Product();
		product.setProId(proId);
		product.setProName(UpdatepoductName);
		product.setProPrice(UpdatepoductPrice);
		product.setProBrand(UpdatepoductBrand);
		product.setProMadeIn(UpdatepoductMadeIn);
		product.setProMfgDate(UpdatepoductMfgDate);
		product.setProExpDate(UpdatepoductExpDate);
		
		Part filePart=request.getPart("newproImage");//new proImage is the name of your file input input field
		
		if(filePart != null && filePart.getSize()> 0)
		{
			InputStream inputStream = filePart.getInputStream();
			byte[] newImagedata = IOUtils.toByteArray(inputStream);
			product.setProImage(newImagedata);
		}
		else
		{
			 Part file=request.getPart("existingImage");
			InputStream inputStream =file.getInputStream();
			byte[] existingImage = IOUtils.toByteArray(inputStream);
			product.setProImage(existingImage);
		}
		ProductDao dao = new ProductDao();
		int result =dao.UpdateById(product);
		if(result==1)
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("ProductList.jsp");
			dispatcher.forward(request, response);
			
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			writer.println("Data Update fail check once...."+result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("add-product.html");
			dispatcher.include(request, response);
		}
	}

	
	}
