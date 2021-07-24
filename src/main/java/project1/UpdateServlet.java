package project1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out=response.getWriter();  
	      
		//sid,sname,semester,gname,age,aname,email_address

        String sid= request.getParameter("sid");
		String sname= request.getParameter("sname");	
		//String semester= request.getParameter("semester");
		String gname= request.getParameter("gname");
		//String email_address= request.getParameter("email_address");
		String aname= request.getParameter("aname");
		String prize = request.getParameter("prize");
		
		Student e=new Student();  
		
	    e.setSid(sid);
	    e.setSname(sname);  
 	    e.setGname(gname);  
 	    e.setAname(aname);
	    e.setPrize(prize);
	   	
	     //out.println("Record "+ e.getSid()+ "name "+ e.getSname() );//debug statement  
	       
	
	    int status=StudentDAO.update(e);  
	  
	    if(status>0){
	    	
	        response.sendRedirect("ViewRecord");  
	    }else{  
	        out.println("Sorry! unable to update record " );  
	    }  
	    System.out.println("status = "+ status ); 
	    out.close();  
		}
	}


