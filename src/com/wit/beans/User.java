package com.wit.beans;

import java.io.Serializable;

public class User implements Serializable {
	private String snum;
	private String password;
	private String sname;
	private String ucontactway;
	private String actor;
	
	public User(String snum, String password, String sname, String ucontactway,String actor) {
		super();
		this.snum = snum;
		this.password = password;
		this.sname = sname;
		this.ucontactway = ucontactway;
		this.actor = actor;
	}

	

	public User(String snum, String password, String sname, String ucontactway) {
		super();
		this.snum = snum;
		this.password = password;
		this.sname = sname;
		this.ucontactway = ucontactway;
	}



	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getSnum() {
		return snum;
	}

	public void setSnum(String snum) {
		this.snum = snum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getUcontactway() {
		return ucontactway;
	}

	public void setUcontactway(String ucontactway) {
		this.ucontactway = ucontactway;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "User [snum=" + snum + ", password=" + password + ", sname="
				+ sname + ", ucontactway=" + ucontactway + ", actor=" + actor
				+ "]";
	}

	
	

}
