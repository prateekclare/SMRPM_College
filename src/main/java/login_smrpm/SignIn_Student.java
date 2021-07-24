package login_smrpm;

import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/SignIn_Student")
public class SignIn_Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public SignIn_Student() {
        super();
        // TODO Auto-generated constructor stub
    } 
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		// TO check if username and password are correct
				if (user.equals("admin") && pass.equals("superuser"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.forward(request, response);
				}
				
				else if (user.equals("madhav") && pass.equals("madhav"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.forward(request, response);
				}
				
				else if (user.equals("manpreet") && pass.equals("manpreet"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.forward(request, response);
				}
				
				else if (user.equals("sukhpreet") && pass.equals("sukhpreet"))
				{
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.forward(request, response);
				}
								
				else {

					out.println("<link rel =\"stylesheet\" href=\"css/mystyles.css\">");
					out.println("<div class =\"container\">");		
					out.println("<h3>Error .... User Name / Password Wrong </h3>");	
					out.println("<a href=\"Welcome.html\"><button class=\"button\">Sign out</button></a> ");
					
				}
	}

}
