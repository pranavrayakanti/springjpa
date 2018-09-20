package com.pranav.springjpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	int sid;
	String sname;
	String tech;
//	public int getSid() {
//		return sid;
//	}
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//	public String getSname() {
//		return sname;
//	}
//	public void setSname(String sname) {
//		this.sname = sname;
//	}
//	public String getTech() {
//		return tech;
//	}
//	public void setTech(String tech) {
//		this.tech = tech;
//	}
//	@Override
//	public String toString() {
//		return "Student [sid=" + sid + ", sname=" + sname + ", tech=" + tech + "]";
//	}
//	
//	
	
	

}
