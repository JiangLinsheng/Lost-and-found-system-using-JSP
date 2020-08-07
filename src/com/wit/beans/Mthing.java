package com.wit.beans;

import java.io.Serializable;
import java.sql.Date;


import com.mysql.jdbc.Blob;

public class Mthing implements Serializable{
	private int tnum;
	private String snum;
	private String tname;
	private String type;
	private String color;
	private Date time;
	private String place;
	private String mcontactway;
	private String fileName;
	private int signal;
	private String code;
	public Mthing(int tnum, String snum, String tname, String type,
			String color, Date time, String place, String mcontactway,
			String filename, int signal, String code) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
		this.fileName = filename;
		this.signal = signal;
		this.code = code;
	}
	
	
	
	public Mthing(String snum, String tname, String type, String color,
			String place, String mcontactway, int signal, String code) {
		super();
		this.snum = snum;
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.place = place;
		this.mcontactway = mcontactway;
		this.signal = signal;
		this.code = code;
	}



	public Mthing(int tnum, String snum, String tname, String type,
			String color, String place, String mcontactway, int signal,
			String code) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.place = place;
		this.mcontactway = mcontactway;
		this.signal = signal;
		this.code = code;
	}



	public Mthing(String tname, String type, String color, String place,
			String mcontactway) {
		super();
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.place = place;
		this.mcontactway = mcontactway;
	}
	
	

	public Mthing(int tnum, String tname, String type,
			String color, String place, String mcontactway) {
		super();
		this.tnum = tnum;
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.place = place;
		this.mcontactway = mcontactway;
	}
	

	public Mthing(String tname, String type, String color, Date time,
			String place, String mcontactway) {
		super();
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
	}



	public Mthing(int tnum, String snum, String tname, String type,
			String color, Date time, String place, String mcontactway,
			int signal, String code) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
		this.signal = signal;
		this.code = code;
	}



	public Mthing(int tnum, String snum, String tname, String type,
			String color, Date time, String place, String mcontactway,
			int signal) {
		super();
		this.tnum = tnum;
		this.snum = snum;
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
		this.signal = signal;
	}

	public Mthing(String tname, String type, String color, Date time,
			String place, String mcontactway, String fileName) {
		super();
		this.tname = tname;
		this.type = type;
		this.color = color;
		this.time = time;
		this.place = place;
		this.mcontactway = mcontactway;
		this.fileName = fileName;
	}



	public Mthing() {
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String filename) {
		this.fileName = filename;
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
		return "Mthing [tnum=" + tnum + ", snum=" + snum + ", Tname=" + tname
				+ ", type=" + type + ", color=" + color + ", Time=" + time
				+ ", place=" + place + ", mcontactway=" + mcontactway
				+ ", fileName=" + fileName + ", signal=" + signal + ", code=" + code
				+ "]";
	}
	
	

}
