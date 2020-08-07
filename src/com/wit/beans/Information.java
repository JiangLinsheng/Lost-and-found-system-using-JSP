package com.wit.beans;

import java.io.Serializable;
import java.sql.Date;

public class Information implements Serializable {
	private int tnum;
	private String snum;
	private String tname;
	private String sname;
	private String fileName;
	private String type;
	private String color;
	private Date time;
	private String place;
	private String mcontactway;
	private String ucontactway;
	private int signal;
	private String code;
	public Information(int tnum, String snum, String tname, String sname,
			String filename, String type, String color, Date time, String place,
			String mcontactway, String ucontactway, int signal, String code) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.sname = sname;
		this.fileName = filename;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
		this.ucontactway = ucontactway;
		this.signal = signal;
		this.code = code;
	}
	
	public Information(int tnum, String snum, String tname, String sname,
			String type, String color, String place, String mcontactway,
			String ucontactway, int signal, String code) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.sname = sname;
		this.type = type;
		this.color = color;
		this.place = place;
		this.mcontactway = mcontactway;
		this.ucontactway = ucontactway;
		this.signal = signal;
		this.code = code;
	}


	public Information(int tnum, String snum, String tname, String sname,
			String type, String color, Date time, String place,
			String mcontactway, String ucontactway, int signal, String code) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.sname = sname;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
		this.ucontactway = ucontactway;
		this.signal = signal;
		this.code = code;
	}

	public Information() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTnum() {
		return tnum;
	}
	public void setTnum(int tnum) {
		this.tnum = tnum;
	}
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String filename) {
		this.fileName = filename;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getMcontactway() {
		return mcontactway;
	}
	public void setMcontactway(String mcontactway) {
		this.mcontactway = mcontactway;
	}
	public String getUcontactway() {
		return ucontactway;
	}
	public void setUcontactway(String ucontactway) {
		this.ucontactway = ucontactway;
	}
	public int getSignal() {
		return signal;
	}
	public void setSignal(int signal) {
		this.signal = signal;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "Information [tnum=" + tnum + ", snum=" + snum + ", tname="
				+ tname + ", sname=" + sname + ", fileName=" + fileName + ", type="
				+ type + ", color=" + color + ", time=" + time + ", place="
				+ place + ", mcontactway=" + mcontactway + ", ucontactway="
				+ ucontactway + ", signal=" + signal + ", code=" + code + "]";
	}
	
	

}
