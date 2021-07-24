package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/ViewRecord")
public class ViewRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ViewRecord() {
        super() ;
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
	     
	     PrintWriter out=response.getWriter(); 
	     
//	     out.print("<img src=\"images/1686763.gif\"  height=\"25%px\" width=\"40%\">");
	 
	  //   out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles/main.css\">"); 
	     
	     out.println("");  
	       
	     List<Student> list=StudentDAO.getAllStudents();  
	     out.print("<!DOCTYPE html>");
	        out.print("<!DOCTYPE html>\r\n"
	        		+ "<html>\r\n"
	        		+ "\r\n"
	        		+ "<head>\r\n"
	        		+ "  <meta charset=\"ISO-8859-1\">\r\n"
	        		+ "  <title>SMRPM College</title>\r\n"
	        		+ "\r\n"
	        		+ "  <!-- Required meta tags -->\r\n"
	        		+ "  <meta charset=\"utf-8\">\r\n"
	        		+ "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "  <!-- Bootstrap CSS -->\r\n"
	        		+ "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
	        		+ "    integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n"
	        		+ "\r\n"
	        		+ "  <link rel=\"stylesheet\" href=\"https://unpkg.com/aos@next/dist/aos.css\" />\r\n"
	        		+ "\r\n"
	        		+ "  <!-- âââââââ Navigation Bar Start âââââââ âââââââââ -->\r\n"
	        		+ "  <link rel=\"stylesheet\" href=\"css/navigationStyle.css\">\r\n"
	        		+ "\r\n"
+"<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>"
	        		+ "  <script src=\"javaScript/upper_Nav.js\"></script>\r\n"
	        		+ "\r\n"
	        		+ "  <!-- âââââââââ ââââââââââ ââââââââââ âââââââââââ -->\r\n"

	        		+ "  <style>\r\n"
	        		+ "    body {\r\n"
	        		+ "      background-image:\r\n"
	        		+ "        url(images/1.jpeg\r\n"
	        		+ ");\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    a {\r\n"
	        		+ "      text-decoration: none;\r\n"
	        		+ "      color: whitesmoke;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    a:hover {\r\n"
	        		+ "      text-decoration: none;\r\n"
	        		+ "      color: white;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    #innerS {\r\n"
	        		+ "      box-shadow: 10px 7px 15px rgba(0, 0, 0, 0.445) inset;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    #innerST {\r\n"
	        		+ "      box-shadow: 10px 7px 15px rgba(0, 0, 0, 0.445) inset, 10px 7px 15px rgba(0, 0, 0, 0.445);\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    #innerST2 {\r\n"
	        		+ "      box-shadow: 4px 4px 10px rgba(0, 0, 0, 0.445) inset, 10px 7px 15px rgba(0, 0, 0, 0.445);\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    .form-control {\r\n"
	        		+ "      background-color: #7982ff21;\r\n"
	        		+ "      border: none;\r\n"
	        		+ "      color: white;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "    .sidenav {\r\n"
	        		+ "      height: 100%;\r\n"
	        		+ "      width: 0;\r\n"
	        		+ "      position: fixed;\r\n"
	        		+ "      z-index: 1;\r\n"
	        		+ "      top: 0;\r\n"
	        		+ "      left: 0;\r\n"
	        		+ "      background-color: #111;\r\n"
	        		+ "      overflow-x: hidden;\r\n"
	        		+ "      transition: 0.5s;\r\n"
	        		+ "      padding-top: 60px;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    .sidenav a {\r\n"
	        		+ "      padding: 8px 8px 8px 32px;\r\n"
	        		+ "      text-decoration: none;\r\n"
	        		+ "      font-size: 25px;\r\n"
	        		+ "      color: #818181;\r\n"
	        		+ "      display: block;\r\n"
	        		+ "      transition: 0.3s;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    .sidenav a:hover {\r\n"
	        		+ "      color: #f1f1f1;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    .sidenav .closebtn {\r\n"
	        		+ "      position: absolute;\r\n"
	        		+ "      top: 0;\r\n"
	        		+ "      right: 25px;\r\n"
	        		+ "      font-size: 36px;\r\n"
	        		+ "      margin-left: 50px;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    #main {\r\n"
	        		+ "      transition: margin-left .5s;\r\n"
	        		+ "      padding: 16px;\r\n"
	        		+ "    }\r\n"
	        		+ "\r\n"
	        		+ "    @media screen and (max-height: 450px) {\r\n"
	        		+ "      .sidenav {\r\n"
	        		+ "        padding-top: 15px;\r\n"
	        		+ "      }\r\n"
	        		+ "\r\n"
	        		+ "      .sidenav a {\r\n"
	        		+ "        font-size: 18px;\r\n"
	        		+ "      }\r\n"
	        		+ "    }\r\n"
	        		+ "  </style>\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "  <link href=\"images/schoolPerson.png\" rel=\"shortcut icon\" type=\"image/x-icon\" />\r\n"
	        		+ "\r\n"
	        		+ "  <link href=\"https://unpkg.com/tailwindcss@2.0.2/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n"
	        		+ "  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\">\r\n"
	        		+ "</head>\r\n"
	        		+ "\r\n"
	        		+ "<body>\r\n"
	        		+ "  <div id=\"mySidenav\" class=\"sidenav\">\r\n"
	        		+ "    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\r\n"
	        		+ "    <a href=\"#\">Homepage</a>\r\n"
	        		+ "\r\n"
	        		+ "    <a href=\"ViewRecord\">View Student</a>\r\n"
	        		+ "    <a href=\"Activities.html\">Activities</a>\r\n"
	        		+ "    <a href=\"#\">Rewards</a>\r\n"
	        		+ "\r\n"
	        		+ "    <br>\r\n"
	        		+ "    <a href=\"SignIn_SMRPM.html\">Sign Out</a>\r\n"
	        		+ "\r\n"
	        		+ "    <br>\r\n"
	        		+ "\r\n"
	        		+ "    <div class=\"text-center\"><b style=\"color: white;\">SMRPM College | &#169 2020</b>\r\n"
	        		+ "\r\n"
	        		+ "    </div>\r\n"
	        		+ "\r\n"
	        		+ "  </div>\r\n"
	        		+ "\r\n"
	        		+ "  <div id=\"main\">\r\n"
	        		+ "\r\n"
					/*
					 * +
					 * "    <div data-aos=\"flip-down\" class=\"text-center rounded-pill\" style=\"background-color: rgba(255, 255, 255, 0.63);\r\n"
					 * + "    backdrop-filter: blur(5px); font-size: 4vw;\" id=\"innerST\">\r\n" +
					 * "\r\n" +
					 * "      <div class=\"bg-light\" style=\"position: sticky; z-index: 45;\">\r\n"
					 * +
					 * "        <span class=\"m-2 ml-2 float-start\" style=\"font-size:30px;cursor:pointer\" onclick=\"openNav()\">&#9776;</span>\r\n"
					 * + "      </div>\r\n" + "\r\n" +
					 * "      <b>College</b> <b>Adminstration</b>\r\n" + "\r\n" + "\r\n" + "\r\n" +
					 * "    </div>\r\n" + "\r\n"
					 */
	        		+ "    <br>\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        	
	        	 
	        		+ "\r\n"
	        		+ "    <div class=\"text-center rounded-4 p-4 position-absolute top-40 start-40\" style=\"background-color: rgba(255, 255, 255, 0.63);\r\n"
	        		+ "backdrop-filter: blur(5px); width: 80%; padding-left: 2%; margin-left: 10%;\" id=\"innerST\">\r\n"
	        		
	        		//IMAGE 
	        		+ "      <img data-aos=\"flip-right\" data-aos-easing=\"ease-out-cubic\" data-aos-duration=\"4000\" src=\"images/schoollogo.png\"\r\n"
	        		+ "        style=\"width: 20%; position:absolute; \" class=\"logo rounded-circle position-absolute top-0 start-0 translate-middle float-end\"><br>\r\n"
	        		+ "\r\n"
	        		
	        		+ "      <div class=\"display-5\">\r\n"
	        		
	        		+ "        <b>Student</b> <b>Data</b>\r\n"
	        		+ "      </div>\r\n"
	        		+ "\r\n"
	        		+ "      <div class=\"text-center m-4 pb-4 rounded-bottom\">\r\n"
	        		+ "\r\n"
	        		+ "        <table class=\"table table-hover\">\r\n"
	        		+ "          <thead>\r\n"
	        		+ "            <tr>\r\n"
	        		+ "              <th scope=\"col\">Student Id</th>\r\n"
	        		+ "              <th scope=\"col\">Student Name</th>\r\n"
	        		+ "              <th scope=\"col\">Email address</th>\r\n"
	        		+ "              <th scope=\"col\">Group Name</th>\r\n"
	        		+ "              <th scope=\"col\">Semester</th>\r\n"
	        		+ "              <th scope=\"col\">Prize</th>\r\n"
	        		+ "              <th scope=\"col\">AS_Activity Name</th>\r\n"
	        		+ "\r\n"
	        		+ "              <th scope=\"col\">Add</th>\r\n"
	        		+ "              <th scope=\"col\">Edit</th>\r\n"
	        		+ "              <th scope=\"col\">Delete</th>\r\n"
	        		+ "            </tr>\r\n"
	        		+ "          </thead>\r\n"
	        		+ "          <tbody>\r\n"
	        		+ "            <tr>\r\n");

	        		
	        		 for(Student e:list){  
	     		    	out.print("  <td>"+e.getSid()+"</td>\r\n"
	        		+ "              <td>"+e.getSname()+"</td>\r\n"
	        		+ "              <td>"+e.getEmail_address()+"</td>\r\n" 
	        		+ "              <td>"+e.getGname()+"</td>\r\n"
	        		+ "              <td>"+e.getSemester()+"</td>\r\n" 
	        		+ "              <td>"+e.getPrize()+"</td>\r\n" 
	        		+ "              <td>"+e.getAname()+"</td>\r\n" 
	        		+"            <td><a href='index.html'>\r\n"
	        		+ "                    <i class=\"bi bi-plus-circle-fill\" style=\"font-size: 1.5rem; color: #818181;\"></i></a>\r\n"
	        		+ "              </td>\r\n"
	        		+ "\r\n"
	        		+ "              <td><a href='EditRecord?sid="+e.getSid()+"'>\r\n"
	        		+ "                    <i class=\"bi bi-pencil-square\" style=\"font-size: 1.5rem; color: rgb(170, 207, 84);\"></i></a>\r\n"
	        		+ "              </td>\r\n"
	        		+ "\r\n"
	        		+ "              <td><a href='DeleteRecord?sid="+e.getSid()+"'\"onclick=\"return checkdelete();\"> \r\n"
	        		+ "                    <i class=\"bi bi-person-x-fill\" style=\"font-size: 1.5em; color: rgb(143, 26, 26);\"></i></a>\r\n"
	        		+ "              </td>\r\n"
	        		+ "            </tr>\r\n"
	        		+ "	        		 <script type=\"text/javascript\"> "
	        		+ "	        		 	  function checkdelete() "
	        		+ "	        		 	{ alert('Are u sure'); "
	        		+ "	        		 	 }</script>");
	        		 }
		        		out.print(" </tbody>\r\n"
	        		+ "        </table>\r\n"
		        	
	        		+ "        <button type=\"submit\" class=\"shadow btn btn-warning shadow btn-lg\">\r\n"
	        		+ "          <a href=\"ViewRecord\">Refresh</a>\r\n"
	        		+ "        </button>\r\n"
	        		+ "        <button type=\"submit\" class=\"shadow btn btn-danger shadow btn-lg\">\r\n"
	        		+ "          <a href=\"admin_home.html\">Go Back</a>\r\n"
	        		+ "        </button>\r\n"
	        		+ "      </div>\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "    </div>\r\n"
	        		+ "\r\n"
	        		+ "    <script src=\"https://unpkg.com/aos@next/dist/aos.js\"></script>\r\n"
	        		+ "    <script>\r\n"
	        		+ "      AOS.init();\r\n"
	        		+ "    </script>\r\n"
	        		+ "\r\n"
	        		+ "  </div>\r\n"
	        		+ "\r\n"
	        		+ "\r\n"
	        		+ "</body>\r\n"
	        		+ "\r\n"
	        		+ "</html>"); 
	     
	     //out.print("<table border='1' width='100%'");  
//	        out.print("<tr><th>Student Id</th><th>Student Name</th><th>Group Name</th><th>Prize</th><th>AS_Activity name</th><th>Add</th> <th>Edit</th><th>Delete</th></tr>");  
//		    for(Student e:list){  
//		    	out.print(e.getEmail_address());
//	   out.print("<tr><td>"+e.getSid()+"</td><td>"+e.getSname()+"</td><td>"+e.getGname()+"</td><td>"+e.getPrize()+"</td><td>"+e.getAname()+"</td> <td><a href='index.html'><button class=\"btn btn-primary btn-sm rounded-0\" type=\"button\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Add\"><i class=\"fa fa-table\"></i></button></a></td>  <td><a href='EditRecord?sid="+e.getSid()+"'>   <button class=\"btn btn-success btn-sm rounded-0\" type=\"button\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Edit\"><i class=\"fa fa-edit\"></i></button></a></td>  <td><a href='DeleteRecord?sid="+e.getSid()+"'> <button class=\"btn btn-danger btn-sm rounded-0\" type=\"button\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Delete\"><i class=\"fa fa-trash\"></i></button</a></td></tr>");  
//		       	} 
//	       
//	     out.close();  
	 

	}}


