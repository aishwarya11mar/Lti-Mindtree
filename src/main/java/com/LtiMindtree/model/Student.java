package com.LtiMindtree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long sid;
	private String sname;

	
	
	public Student(long sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;

	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



    public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	
	
	
}
