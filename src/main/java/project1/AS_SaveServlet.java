package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/AS_SaveServlet")  
public class AS_SaveServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
         
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("aname");  
        String sname=request.getParameter("sname");  
        String email=request.getParameter("semail");  
        String groupname=request.getParameter("gname");  
          
         AS_Activity e=new AS_Activity(); 
         e.setId( id);
        e.setAname(name);  
        e.setSname(sname);  
        e.setSemail(email);  
        e.setGname(groupname);  
          
        int status=AS_ActivityDAO.save(e);  
        if(status>0){  
            out.print("<p style=\"color:black;font-size: 50px;padding-bottom: 0px; font-style:bold;\">Record saved successfully!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
}  