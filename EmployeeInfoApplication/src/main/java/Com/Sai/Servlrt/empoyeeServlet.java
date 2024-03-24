package Com.Sai.Servlrt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employeeServlet")
public class empoyeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step:1 Read the data
				int employeeId = Integer.parseInt(request.getParameter("employeeId"));
				String employeeName = request.getParameter("employeeName");
				double basicSalary = Double.parseDouble(request.getParameter("basicSalary"));
				
				double HRA=0.0;
				double DA=0.0;
				double PF=0.0;
				double Grosssalary=1;
				
				if (basicSalary >= 50000) 
		        {
		            HRA = 0.3 * basicSalary;
		            DA = 0.1 * basicSalary;
		            PF = 0.06 * basicSalary;
		        } 
		        else if (basicSalary >= 25000 && basicSalary < 50000) 
		        {
		            HRA = 0.2 * basicSalary;
		            DA = 0.05 * basicSalary;
		            PF = 0.03 * basicSalary;
		        } 
		        else if (basicSalary < 25000) 
		        {
		            HRA = 0.1 * basicSalary;
		            DA = 0.35 * basicSalary;
		            PF = 0.02 * basicSalary;
		        }
				Grosssalary = basicSalary + HRA + DA - PF;
		        
				//step3:Render the response
				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				writer.println("<html><body>");
		        writer.println("<h2>Gross Salary Details:</h2>");
		        writer.println("<p>Employee name:"+employeeName+"</p>");
		        writer.println("<p>Employee Id:"+employeeId+"</p>");
		        writer.println("<p>Basic Salary: " + basicSalary + "</p>");
		        writer.println("<p>HRA: " + HRA + "</p>");
		        writer.println("<p>DA: " + DA + "</p>");
		        writer.println("<p>PF: " + PF + "</p>");
		        writer.println("<p>Gross Salary: " +  Grosssalary+"</p>");
		        writer.println("</body></html>");

				
	}

}
