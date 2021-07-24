package project1;

import java.util.*;

/*
create table student(
sid varchar2(15),
sname varchar2(30),
semester varchar2(30),
gname varchar2(10),

age NUMBER(8,2),
aname varchar2(30),
email_address varchar2(30),
prize varchar2(10)
);
*/

public class Student {
	
	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	private String sid,sname,semester,gname,aname,email_address,prize;
	private Integer age;
	
	public Student() {
		
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getEmail_address() {
		return email_address;
	}

	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}


	

}
