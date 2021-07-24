package project1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
 
@WebServlet("/ViewServlet2")  
public class ViewServlet2 extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        
        List<AS_Activity> list=AS_ActivityDAO.getAllActivities();  
         
        out.println("<h1 style=\"color:white; padding:100px ; margin-left:265px ; text-decoration: none;\">Activity list"
        		+ "<br>"
        		+ "<hr> <a href='index_sportsAct.html' style=\"color:white\">Add New Activity</a>&nbsp&nbsp&nbsp&nbsp"
        		+ "<a href='admin_home.html' style=\\\"color:white\\\">GoBack</a>"
        		+ "</h1>");
       
out.print("<div class=\"container\">\r\n"
		+ "	<table>\r\n"
		+ "		<thead>\r\n"
		+ "			<tr>\r\n"
		+"<th>Id</th>"
 		+ "<th>Activity Name</th>"
 		+ "<th>Student Name </th>"
 		+ "<th>Student Email</th>"
 		+ "<th>Group Name</th>"
 		+ "<th>Edit</th>"
 		+ "<th>Delete</th>"
		+ "			</tr>\r\n"
		 );
	 for( AS_Activity e:list){  
		         out.print("<tr>"
		         		+ "<td>"+e.getId()+"</td>"
		         				+ "<td>"+e.getAname()+"</td>"
		         						+ "<td>"+e.getSname()+"</td>"
		         								+ " <td>"+e.getSemail()+"</td>"
		         										+ "<td>"+e.getGname()+"</td>"
		         												+ "<td><a href='AS_EditServlet?id="+e.getId()+"' style=\"color:white ;\">Edit</a></td>"
		         														+ "<td><a href='AS_DeleteServlet?id="+e.getId()+"' style=\"color:white ;\">Delete</a></td>"
		         																+ "</tr>");  }
	 out.print("</thead>");	
out.print("</tbody>");
out.print("	</table>");
 
out.print("</div>");
out.print("<style>html,\r\n"
		+ "body {\r\n"
		+ "	height: 100%;\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "body {\r\n"
		+ "	margin: 0;\r\n"
		+ "	background-image:url(3.jpg);\r\n"
		+"background-size:cover;\r\n"
		+ "	font-family: sans-serif;\r\n"
		+ "	font-weight: 100;\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ ".container {\r\n"
		+ "	position: absolute;\r\n"
		+ "	top: 50%;\r\n"
		+ "	left: 50%;\r\n"
		+ "	transform: translate(-50%, -50%);\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "table {\r\n"
		+ "	width: 800px;\r\n"
		+ "	border-collapse: collapse;\r\n"
		+ "	overflow: hidden;\r\n"
		+ "	box-shadow: 0 0 20px rgba(0,0,0,0.1);\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "th,\r\n"
		+ "td {\r\n"
		+ "	padding: 15px;\r\n"
		+ "	background-color: rgba(255,255,255,0.2);\r\n"
		+ "	color: #fff;\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "th {\r\n"
		+ "	text-align: left;\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "thead {\r\n"
		+ "	th {\r\n"
		+ "		background-color: #55608f;\r\n"
		+ "	}\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "tbody {\r\n"
		+ "	tr {\r\n"
		+ "		&:hover {\r\n"
		+ "			background-color: rgba(255,255,255,0.3);\r\n"
		+ "		}\r\n"
		+ "	}\r\n"
		+ "	td {\r\n"
		+ "		position: relative;\r\n"
		+ "		&:hover {\r\n"
		+ "			&:before {\r\n"
		+ "				content: \"\";\r\n"
		+ "				position: absolute;\r\n"
		+ "				left: 0;\r\n"
		+ "				right: 0;\r\n"
		+ "				top: -9999px;\r\n"
		+ "				bottom: -9999px;\r\n"
		+ "				background-color: rgba(255,255,255,0.2);\r\n"
		+ "				z-index: -1;\r\n"
		+ "			}\r\n"
		+ "		}\r\n"
		+ "	}\r\n"
		+ "}</style>");
        out.close(); }}