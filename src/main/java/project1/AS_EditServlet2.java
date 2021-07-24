package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/AS_EditServlet2")  
public class AS_EditServlet2 extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String name=request.getParameter("aname");  
        String sname =request.getParameter("sname");  
        String email=request.getParameter("semail");  
        String groupname=request.getParameter("gname"); 
          
        AS_Activity e=new  AS_Activity();  
        e.setId(id);  
        e.setAname(name);  
        e.setSname(sname);  
        e.setSemail(email);  
        e.setGname (groupname);  
          
        int status=AS_ActivityDAO.update(e);  
        if(status>0){  
            response.sendRedirect("ViewServlet2");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  