package com.excelonline.spring.orm_03._02SpringHibernateApproach1;


public class User {
	
	private int uid;
	
	private String uname, role;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid)
	{
		this.uid = uid;
	}
	
	
}
