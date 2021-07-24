package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;

@WebServlet("/NewServlet")
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NewServlet() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
         PrintWriter out=response.getWriter();
                  
         String sid= request.getParameter("sid");
 		String sname= request.getParameter("sname");
 		String semester= request.getParameter("semester");
 		String gname= request.getParameter("gname");
 		
 		Integer age=Integer.parseInt(request.getParameter("age")); 		 
 		String aname=request.getParameter("aname");
 		String email_address=request.getParameter("email_address"); 		
 		
 		Student e=new Student();  
 		
	    e.setSid(sid);
	    e.setSname(sname);
	    e.setSemester(semester);
	    e.setGname(gname);
	    
	    e.setAge(age);	 
	    e.setAname(aname);
	    e.setEmail_address(email_address);

         int status=StudentDAO.save(e);
         if(status>0){ 
        	 
        	 out.println("<!doctype html>\r\n"
        	 		+ "<html lang=\"en\">\r\n"
        	 		+ "  <head>\r\n"
        	 		+ "    <!-- Required meta tags -->\r\n"
        	 		+ "    <meta charset=\"utf-8\">\r\n"
        	 		+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        	 		+ "\r\n"
        	 		+ "    <!-- Bootstrap CSS -->\r\n"
        	 		+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n"
        	 		+ "\r\n"
        	 		+ "       <style>\r\n"
        	 		+ "              \r\n"
        	 		+ "	.innerS{\r\n"
        	 		+ "      box-shadow: 10px 7px 15px rgba(0, 0, 0, 0.445) inset;\r\n"
        	 		+ "    }\r\n"
        	 		+ "       </style>\r\n"
        	 		+ "\r\n"
        	 		+ "    <title>Hello, world!</title>\r\n"
        	 		+ "  </head>\r\n"
        	 		+ "  <body>\r\n"
        	 		+ "<div class=\"jumbotron p-3 m-3\"> \r\n"
        	 		+ "         \r\n"
        	 		+ "  <div class=\"float-end\"> \r\n"
        	 		+ "       <img src=\"https://i.pinimg.com/originals/ae/f7/e5/aef7e5a8785d25818d138c04787666f9.gif\" class=\"container-fluid d-block innerS\" style=\"width: 50%; box-shadow: 12px 0px 14px;\">\r\n"
        	 		+ " </div>\r\n"
        	 		+ " \r\n"
        	 		+ "  <h1 class=\"display-4 mt-3\"><b>Dear, Student!</b></h1>\r\n"
        	 		+ " \r\n"
        	 		+ "  <p class=\"lead\">\r\n"
        	 		+ "       Record saved successfully!\r\n"
        	 		+ "  </p>\r\n"
        	 		+ "  <p>\r\n"
        	 		+ "       You will receive a mail from college staff, If you won a price.\r\n"
        	 		+ "         \r\n"
        	 		+ "  </p>\r\n"
        	 		+ "\r\n"
        	 		+ "  <hr class=\"my-4\">\r\n"
        	 		+ " <!-- <button type=\\\"submit\\\" class=\\\"shadow btn btn-primary btn-lg\\\"><a href=\\\"ViewRecord\\\">View Records</a></button>\r\n"
        	 		+ "  -->\r\n"
        	 		+ "  <p>\r\n"
        	 		+ "         Please Take care of the dead lines and submit on time.         \r\n"
        	 		+ "  </p>\r\n"
        	 		+ "\r\n"
        	 		+ "  <h4>All The best !</h4>\r\n"
        	 		+ "\r\n"
        	 		+ "  <a class=\"btn btn-danger btn-lg shadow\" href=\"SignIn_SMRPM.html\" role=\"button\">Sign Out</a>\r\n"
        	 		+ "  <a class=\"btn btn-success btn-lg shadow\" href=\"index.html\" role=\"button\">Add Another Response</a>\r\n"
        	 		+ "  <a class=\"btn btn-warning btn-lg shadow\" href=\"Activities.html\" role=\"button\">Activities</a>\r\n"
        	 		+ "\r\n"
        	 		+ "  \r\n"
        	 		+ "</div>\r\n"
        	 		+ "\r\n"
        	 		+ "   \r\n"
        	 		+ "\r\n"
        	 		+ "    <!-- Option 1: Bootstrap Bundle with Popper -->\r\n"
        	 		+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\" crossorigin=\"anonymous\"></script>\r\n"
        	 		+ "\r\n"
        	 		+ "  </body>\r\n"
        	 		+ "</html>");
        	 
                
         }else{  
             out.println("Sorry! unable to save record");  
         }  
           
        out.close(); 
	}

	}


