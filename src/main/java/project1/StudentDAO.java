package project1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
public StudentDAO() {
		
	}
//############################# Make Connection #############################

	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("oracle.jdbc.driver.OracleDriver");  
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "abc@1234D");
            System.out.print("in jdbc"+con);
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
	
	// ############################# For Save/INSERT #############################

	public static int save(Student e){  
        int status=0;  
        try{  
            Connection con=getConnection();  
            System.out.println("after connection done");
            PreparedStatement ps=con.prepareStatement("insert into Student(sid,sname,semester,gname,age,aname,email_address,prize) values (?,?,?,?,?,?,?,?)");
            System.out.println("after insert statement");
            ps.setString(1,e.getSid());  
            ps.setString(2,e.getSname());    
            ps.setString(3,e.getSemester());   
            ps.setString(4,e.getGname());    
            ps.setInt(5,e.getAge());
            ps.setString(6,e.getAname());
            ps.setString(7,e.getEmail_address());        
            ps.setString(8,e.getPrize()); 
              
            status=ps.executeUpdate(); 
              
            con.close();   
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	
	// ############################# For Selecting #############################
	// Can give any name
	public static Student getStudentByname(String nm){  
        Student s=new Student();  
          
        try{  
            Connection con=StudentDAO.getConnection();  
            PreparedStatement ps=con.prepareStatement("select sid,sname,semester,gname,age,aname,email_address from student where sname=?");  
            ps.setString(1,nm);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                s.setSid(rs.getString(1));  
                s.setSname(rs.getString(2));  
                s.setSemester(rs.getString(3));
                s.setGname(rs.getString(4));
                
                s.setAge(rs.getInt(5));
                s.setAname(rs.getString(6));
                s.setGname(rs.getString(7));
               
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return s;  
    }  
	
	// #############################  Edit #############################
	
	public static Student getStudentByid(String sid){  
		Student e=new Student();  
        System.out.println("\n in getStudentByid() method where name parameter "+sid);
        try{  
            Connection con=StudentDAO.getConnection();  
            PreparedStatement ps=con.prepareStatement("select sid,sname,semester,gname,age,aname,email_address,prize from student where sid=?");  
           
            ps.setString(1,sid);  
            ResultSet rs=ps.executeQuery();  
            
            if(rs.next()){  
                e.setSid((rs.getString(1)));                  
                e.setSname(rs.getString(2));
                e.setSemester(rs.getString(3));                
                e.setGname(rs.getString(4));
                
                e.setAge(rs.getInt(5)); 
                e.setAname(rs.getString(6)); 
                e.setEmail_address(rs.getString(7)); 
                e.setPrize(rs.getString(8)); 
                
                System.out.print("\n name is "+e.getSname());
                
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          System.out.println("\n in getStudentByid() method where id is "+e.getSid());
        return e;  
    }  
	
	//fetch #############################
	
			// DISPLAYING
	public static List<Student> getAllStudents(){  
        List<Student> list=new ArrayList<Student>();  
          
        try{  
            Connection con=StudentDAO.getConnection(); 
            PreparedStatement ps=con.prepareStatement("select sid,sname,semester,gname,aname,email_address,prize from student");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Student s=new Student();  
                s.setSid(rs.getString(1));  
                s.setSname(rs.getString(2));
                s.setSemester(rs.getString(3));
                 
                s.setGname(rs.getString(4));
                
                s.setAname(rs.getString(5));
                s.setEmail_address(rs.getString(6));

                s.setPrize(rs.getString(7));
               
                list.add(s);
               
                     
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();
        }  
          
        return list;  
    }  
	// ############################# >> Updating Row IN Table  
	
		 public static int update(Student e){  
		        int status=0;  
		        try{  
		            Connection con=StudentDAO.getConnection();  
		            PreparedStatement ps=con.prepareStatement(  
		            		"update student set sname=?,gname=?,prize=? where sid=?");  
	        		//sid,sname,semester,gname,age,aname,email_address

		            ps.setString(1,e.getSname());  
		           // ps.setString(2,e.getEmail_address());  
		            ps.setString(2,e.getGname());  
		            
 		            ps.setString(3,e.getPrize());  

		            ps.setString(4,e.getSid());  
		          
		            System.out.println(ps.getUpdateCount());
		          // System.out.println("EmpDAO save( ) method empid = "+ e.getStid()+ "  name "+ e.getSname()+"  \n " ); 
		            status=ps.executeUpdate();  
		              
		            con.close();  
		        }catch(Exception ex){ex.printStackTrace();}  
		          
		        return status;  
		    }
			// ############################# >> Deleting Row IN Table  
			
		public static int delete(String sid) {
			// TODO Auto-generated method stub
			 int status=0;  
		        try{  
		            Connection con=StudentDAO.getConnection();  
		            PreparedStatement ps=con.prepareStatement("delete from student where sid=?");  
		            ps.setString(1,sid);  
		            status=ps.executeUpdate();  
		              
		            con.close();  
		        }catch(Exception e){e.printStackTrace();}  
		          
		        return status;  
		     
		}  

	
}



