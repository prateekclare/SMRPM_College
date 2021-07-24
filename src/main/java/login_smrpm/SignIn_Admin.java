package login_smrpm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/SignIn_Admin")
public class SignIn_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SignIn_Admin() {
        super();
    }
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		// TO check if username and password are correct
		if (user.equals("prateek") && pass.equals("prateek"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("admin_home.html");
			rd.forward(request, response);
		}
		
		else if (user.equals("robindeep") && pass.equals("robindeep"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("admin_home.html");
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
