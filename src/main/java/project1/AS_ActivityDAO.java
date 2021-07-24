package project1;

import java.util.*;  
import java.sql.*;  


public class AS_ActivityDAO {
	 
	 
	  
	    public static Connection getConnection(){  
	        Connection con=null;  
	        try{  
	            Class.forName("oracle.jdbc.driver.OracleDriver");  
	            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","abc@1234D");  
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	    public static int save(AS_Activity e){  
	        int status=0;  
	        try{  
	            Connection con=AS_ActivityDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into  activity(id,aname,sname,semail,gname) values (?,?,?,?,?)");
	            ps.setInt(1,e.getId());
	            ps.setString(2,e.getAname());  
	            ps.setString(3,e.getSname());  
	            ps.setString(4,e.getSemail());  
	            ps.setString(5,e.getGname());
	            
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static int update(AS_Activity e){  
	        int status=0;  
	        try{  
	            Connection con=AS_ActivityDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update activity set aname=?,sname=?,semail=?,gname=? where id=?");  
	            ps.setString(1,e.getAname());  
	            ps.setString(2,e.getSname());  
	            ps.setString(3,e.getSemail());  
	            ps.setString(4,e.getGname());  
	            ps.setInt(5,e.getId());  
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static int delete(int id){  
	        int status=0;  
	        try{  
	            Connection con=AS_ActivityDAO .getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from  activity where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static  AS_Activity getActivityById(int id){  
	        AS_Activity e=new AS_Activity();  
	          
	        try{  
	            Connection con=AS_ActivityDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from  activity where id=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setId(rs.getInt(1));  
	                e.setAname(rs.getString(2));  
	                e.setSname(rs.getString(3));  
	                e.setSemail(rs.getString(4));  
	                e.setGname(rs.getString(5));  
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	    }  
	    public static List<AS_Activity> getAllActivities(){  
	        List<AS_Activity> list=new ArrayList<AS_Activity>();  
	          
	        try{  
	            Connection con=AS_ActivityDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from  activity");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	                AS_Activity e=new  AS_Activity();  
	                e.setId(rs.getInt(1));  
	                e.setAname(rs.getString(2));  
	                e.setSname(rs.getString(3));  
	                e.setSemail(rs.getString(4));  
	                e.setGname(rs.getString(5));  
	                list.add(e);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }  
	}  
	

