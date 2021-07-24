package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/EditRecord")
public class EditRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public EditRecord() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         
        String sid=request.getParameter("sid");  
     
       
          
       Student e=StudentDAO.getStudentByid(sid);  
        
        out.print("<!doctype html>\r\n"
        		+ "<html lang=\"en\">\r\n"
        		+ "\r\n"
        		+ "<head>\r\n"
        		+ "  <!-- Required meta tags -->\r\n"
        		+ "  <meta charset=\"utf-8\">\r\n"
        		+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
        		+ "\r\n"
        		+ "  <!-- Bootstrap CSS -->\r\n"
        		+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
        		+ "    integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n"
        		+ "\r\n"
        		+ "  <link rel=\"stylesheet\" href=\"css/admin_style.css\">\r\n"
        		+ "  <style>\r\n"
        		+ "    body {\r\n"
        		+ "      background-image: url(https://www.epmmagazine.com/downloads/4971/download/Award.gif?cb=b3ec48c9269f6a383f161b0d2d836913&w=1000);\r\n"
        		+ "      background-position: initial;\r\n"
        		+ "      background-repeat: repeat-y;\r\n"
        		+ "      background-size: cover;\r\n"
        		+ "    }\r\n"
        		+ "\r\n"
        		+ "    .infoContainer {\r\n"
        		+ "      padding: 4%;\r\n"
        		+ "      box-shadow: 3px 0px 5px black, 8px 0px 130px rgba(138, 138, 138, 0.319) inset, 0px 0px 20px rgba(226, 226, 226, 0.411) inset;\r\n"
        		+ "      border-radius: 15px 50px;\r\n"
        		+ "    }\r\n"
        		+ "\r\n"
        		+ "    dl {\r\n"
        		+ "\r\n"
        		+ "      padding: 0.5em;\r\n"
        		+ "    }\r\n"
        		+ "\r\n"
        		+ "    dt {\r\n"
        		+ "      float: left;\r\n"
        		+ "      clear: left;\r\n"
        		+ "      width: 100px;\r\n"
        		+ "      text-align: right;\r\n"
        		+ "      font-weight: bold;\r\n"
        		+ "    }\r\n"
        		+ "\r\n"
        		+ "    dd {\r\n"
        		+ "      margin: 0 0 0 110px;\r\n"
        		+ "      padding: 0 0 0.5em 0;\r\n"
        		+ "      word-wrap: initial;\r\n"
        		+ "    }\r\n"
        		+ "  </style>\r\n"
        		+ "  <title>Reward</title>\r\n"
        	 
        		+ "<!-- Favicoon --> "
        		+ "  <link href=\"images/schoolPerson.png\" rel=\"shortcut icon\" type=\"image/x-icon\" />\r\n"
        	 
        		+ "</head>");     
        out.print("<body>");


        out.println("<form action='UpdateServlet' method='post'>\r\n"
        		+ "  <div class=\"rounded-4 p-4 infoContainer\" style=\"background-color: rgba(255, 255, 255, 0.829);\r\n"
        		+ "    backdrop-filter: blur(5px); position:absolute; width: 50%; padding-left: 2%; margin: 5%;\" id=\"innerST\">\r\n"
        	
        		+ "    <div class=\"display-6\"> "
        		+ "      <b>Edit Student Data with id "+e.getSid()+" </b>"
        		+ "    </div>"
       		+ "    <div class=\"text-center m-4 pb-4 rounded-bottom\">"
        		
        		+ "      <!-- ****************************************************************** -->");
   
      
        out.print("<table class=\"table-success\">");  
        out.print("<tr><td></td><td><input type='hidden' name='sid' value='"+e.getSid()+"'/></td></tr>");  
        out.print(" <tr>"
        		+ "        		            <th scope='col'/>Student Name</th>"

        	+ "            <th scope=\"col\">Group Name</th>"

        + "          </tr>"
        		+ "        		       </thead>"
        		+ "        	        <tbody>"
        		+ "        		        <tr>"
        	//sid,sname,semester,gname,age,aname,email_address\r\n
        		+ "   <th scope=\"row\"><input class=\"form-control bg-light text-dark\" size=\"auto\" name='sname' value='"+e.getSname()+"'/></th>"
        		+ "           <th scope=\"row\"><input class=\"form-control bg-light text-dark\" size=\"auto\" name='gname' value='"+e.getGname()+"'/></th>"
        	
        		+ "      </tr></tbody>"
        		+ "      </table>"
        		+ "<div style=\"font-size: 20px;\">");
        		


        out.print(" "

        		+ "<!-- <label class=\"btn btn-warning disabled\">Prize</label> -->\r\n"
        		+ "          <div class=\"col-12\">    "
        		+ "  <!-- ****************************************************************** -->\r\n"
           		+ "    </div>\r\n" 
        		+ "    <div><br>"
        		+ "      <span class=\"display-6\"><b>Give Prize</b></span>\r\n"
        		+ "      <span>as per the data you have</span>\r\n"
        		+ "    </div>"
        		+ "    <div class=\"shadow\">"
        		+ "      <hr />"
        		+ "      <div class=\"m-4 pb-4 rounded-bottom col-10\">\r\n"
        		+ "\r\n"
        		+ "        <!-- ****************************************************************** -->\r\n"
           		+ "  <dt>Semester </dt>"
        		+ "        <dd>"+e.getSemester()+"</dd>"
        	
        		+ "         <dt>AS_Activity Name</dt>"
        		+ "          <dd>"+e.getAname()+"</dd>"
      
        	
        		+ "   <br><hr>         <span class=\"text-center\"><b>Select Prize From Dropdown Menu</b></span>\r\n"
        	
        		+ "            <select type=\"text\" name=\"prize\" required id=\"semester\""
        		+ "              class=\"form-select bg-light btn-outline-warning text-dark\">"
        	
        		+ "          </div>\r\n"
        		+ "          <option selected>Select</option>\r\n"
        	
        		+ "          <option class=\"bg-warning\">First</option>"
        		+ "          <option>Second</option>"
        		+ "          <option>Third</option>"
        		+ "          <option>Forth</option>"
        		+ "          <option>No-Price</option>"); 
      
        out.print(" </div>"
        		+ "        <!-- ****************************************************************** -->"
        		+ "      </div> <br><input type='submit' value='Save Changes' class=\"btn btn-lg btn-primary\"/>\r\n"
        		+ "    </div>\r\n"
        		+ "  </div>\r\n"
        		+ "</form>\r\n"

        		+ "  <!--Bootstrap Bundle with Popper -->\r\n"
        		+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"\r\n"
        		+ "    integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\"\r\n"
        		+ "    crossorigin=\"anonymous\"></script>"

        		+ "</body></html>");
            
//        
//        out.print("<!doctype html>\r\n"
//        		+ "<html lang=\"en\">\r\n"
//        		+ "\r\n"
//        		+ "<head>\r\n"
//        		+ "  <!-- Required meta tags -->\r\n"
//        		+ "  <meta charset=\"utf-8\">\r\n"
//        		+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
//        		+ "\r\n"
//        		+ "  <!-- Bootstrap CSS -->\r\n"
//        		+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
//        		+ "    integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n"
//        		+ "\r\n"
//        		+ "  <link rel=\"stylesheet\" href=\"css/admin_style.css\">\r\n"
//        		+ "  <style>\r\n"
//        		+ "    body {\r\n"
//        		+ "      background-image: url(https://www.epmmagazine.com/downloads/4971/download/Award.gif?cb=b3ec48c9269f6a383f161b0d2d836913&w=1000);\r\n"
//        		+ "      background-position: initial;\r\n"
//        		+ "      background-repeat: repeat-y;\r\n"
//        		+ "      background-size: cover;\r\n"
//        		+ "    }\r\n"
//        		+ "\r\n"
//        		+ "    .infoContainer {\r\n"
//        		+ "      padding: 4%;\r\n"
//        		+ "      box-shadow: 3px 0px 5px black, 8px 0px 130px rgba(138, 138, 138, 0.319) inset, 0px 0px 20px rgba(226, 226, 226, 0.411) inset;\r\n"
//        		+ "      border-radius: 15px 50px;\r\n"
//        		+ "    }\r\n"
//        		+ "\r\n"
//        		+ "    dl {\r\n"
//        		+ "\r\n"
//        		+ "      padding: 0.5em;\r\n"
//        		+ "    }\r\n"
//        		+ "\r\n"
//        		+ "    dt {\r\n"
//        		+ "      float: left;\r\n"
//        		+ "      clear: left;\r\n"
//        		+ "      width: 100px;\r\n"
//        		+ "      text-align: right;\r\n"
//        		+ "      font-weight: bold;\r\n"
//        		+ "    }\r\n"
//        		+ "\r\n"
//        		+ "    dd {\r\n"
//        		+ "      margin: 0 0 0 110px;\r\n"
//        		+ "      padding: 0 0 0.5em 0;\r\n"
//        		+ "      word-wrap: initial;\r\n"
//        		+ "    }\r\n"
//        		+ "  </style>\r\n"
//        		+ "  <title>Reward</title>\r\n"
//        		+ "</head>\r\n"
//        		+ "\r\n"
//        		+ "<body>\r\n"
//        		+ "  <div class=\"rounded-4 p-4 infoContainer\" style=\"background-color: rgba(255, 255, 255, 0.829);\r\n"
//        		+ "    backdrop-filter: blur(5px); position:absolute; width: 50%; padding-left: 2%; margin: 5%;\" id=\"innerST\">\r\n"
//        		+ "\r\n"
//        		+ "    <div class=\"display-6\">\r\n"
//        		
//        		
//        		
//        		+ "      <b>Edit Student Data with id "+e.getSid()+" </b>\r\n"
//        		+ "    </div>\r\n"
//        		+ "\r\n"
//        		+ "    <div class=\"text-center m-4 pb-4 rounded-bottom\">\r\n"
//        		+ "\r\n"
//        		
//        		+"<form action='UpdateServlet' method='post'>"
//        		+ "      <!-- ****************************************************************** -->\r\n"
//        		+ "      <table class=\"table table-hover\">\r\n"
//        		+ "        <thead>\r\n"
//        		+ "          <tr>\r\n"
//        		+ "            <th scope='col'/>Student Name</th>\r\n"
//        		+ "\r\n"
//        		+ "            <th scope=\"col\">Email address</th>\r\n"
//        		+ "            <th scope=\"col\">Group Name</th>\r\n"
//        		+ "\r\n"
//        		+ "          </tr>\r\n"
//        		+ "        </thead>\r\n"
//        		+ "        <tbody>\r\n"
//        		+ "          <tr>\r\n"
//        		//sid,sname,semester,gname,age,aname,email_address
//        		+ "   <th scope=\"row\"><input class=\"form-control bg-dark\" size=\"auto\" name='sname' value='"+e.getSname()+"'/></th>\r\n"
//        		+ "            <th scope=\"row\"><input class=\"form-control\" size=\"auto\" name='email_address' value='"+e.getEmail_address()+"'/></th>\r\n"
//        		+ "            <th scope=\"row\"><input class=\"form-control\" size=\"auto\" name='gname' value='"+e.getGname()+"'/></th>\r\n"
//        		
//        		+ "          </tr>\r\n"
//        		+ "\r\n"
//        		+ "        </tbody>\r\n"
//        		+ "      </table>\r\n"
//        		+ "      <!-- ****************************************************************** -->\r\n"
//        		+ "\r\n"
//        		+ "    </div>\r\n"
//        		+ "\r\n"
//        		+ "    <div>\r\n"
//        		+ "      <span class=\"display-6\"><b>Give Prize</b></span>\r\n"
//        		+ "      <span>as per the data you have</span>\r\n"
//        		+ "    </div>\r\n"
//        		+ "\r\n"
//        		+ "    <div class=\"shadow\">\r\n"
//        		+ "\r\n"
//        		+ "      <hr />\r\n"
//        		+ "      <div class=\"m-4 pb-4 rounded-bottom col-10\">\r\n"
//        		+ "\r\n"
//        		+ "        <!-- ****************************************************************** -->\r\n"
//        		+ "\r\n"
//        		+ "        <div style=\"font-size: 20px;\">\r\n"
//        		
//        		+ "          <dt>Semester </dt>\r\n"
//        		+ "          <dd>"+e.getSemester()+"</dd>\r\n"
//        	
//        		+ "          <dt>AS_Activity Name</dt>\r\n"
//        		+ "          <dd>"+e.getAname()+"</dd>\r\n"
//        		
//        		+ "\r\n"
//        		+ "          <!-- ****************************************************************** -->\r\n"
//        		+ "          <br>\r\n"
//        		+ "\r\n"
//        		+ "          <!-- <label class=\"btn btn-warning disabled\">Prize</label> -->\r\n"
//        		+ "          <div class=\"col-12\">\r\n"
//        		+ "\r\n"
//        		+ "            <span class=\"text-center\"><b>Select Prize From Dropdown Menu</b></span>\r\n"
//        		+ "\r\n"
//        		+ "            <select type=\"text\" name=\"prize\" required id=\"prize\"\r\n"
//        		+ "              class=\"form-select bg-light btn-outline-warning text-dark\">\r\n"
//        		+ "\r\n"
//        		+ "          </div>\r\n"
//        		+ "          <option selected>Choose one Prize...</option>\r\n"
//        		+ "\r\n"
//        		+ "          <option class=\"bg-warning\">First</option>\r\n"
//        		+ "          <option>Second</option>\r\n"
//        		+ "          <option>Third</option>\r\n"
//        		+ "          <option>Forth</option>\r\n"
//        		+ "          <option>No-Price</option>\r\n"
//        		+ "\r\n"
//        		+ "        </div>\r\n"
//        		+ "        <!-- ****************************************************************** -->\r\n"
//        		+ "      </div>\r\n"
//        		+ "\r\n"
//        		+ "    </div>\r\n"
//        		+ "  </div>\r\n"
//        		+ "\r\n"
//        		+ "<input type='submit' class='btn btn-lg btn-success' value='Save Changes '/>"
//        		
//        		+ "  <!--Bootstrap Bundle with Popper -->\r\n"
//        		+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"\r\n"
//        		+ "    integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\"\r\n"
//        		+ "    crossorigin=\"anonymous\"></script>\r\n"
//        		+ "\r\n"
//        		+ "</form></body>\r\n"
//        		+ "\r\n"
//        		+ "</html>");
        out.close();  
    }  
}

