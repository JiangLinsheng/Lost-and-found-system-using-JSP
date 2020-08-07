package com.wit.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.wit.beans.Information;
import com.wit.utils.DBManager;

public class InfoDAO {
	public List<Information> listInfos(){
		List<Information> infos = new ArrayList<Information>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int Tnum = rs.getInt("Tnum");
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Type = rs.getString("Type");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				int Signal = rs.getInt("Signal");
				String Code = rs.getString("Code");
				Information i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				infos.add(i);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	public Information queryInfo(int Tnum){
		Information i = null;
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information where Tnum=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Tnum);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Type = rs.getString("Type");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				int Signal = rs.getInt("Signal");
				String Code = rs.getString("Code");
				i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public List<Information> listInfos(String Type){
		List<Information> infos = new ArrayList<Information>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information where Type=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Type);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int Tnum = rs.getInt("Tnum");
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				int Signal = rs.getInt("Signal");
				String Code = rs.getString("Code");
				Information i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				infos.add(i);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	public List<Information> listInfos(int Signal){
		List<Information> infos = new ArrayList<Information>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information where Signal=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, Signal);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int Tnum = rs.getInt("Tnum");
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Type = rs.getString("Type");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				String Code = rs.getString("Code");
				Information i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				infos.add(i);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	public List<Information> timelistInfos_0(){
		List<Information> infos = new ArrayList<Information>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information where datediff(Time,date_sub(curdate(),INTERVAL 7 DAY))>=0";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int Tnum = rs.getInt("Tnum");
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Type = rs.getString("Type");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				int Signal = rs.getInt("Signal");
				String Code = rs.getString("Code");
				Information i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				infos.add(i);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	public List<Information> timelistInfos_1(){
		List<Information> infos = new ArrayList<Information>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information where datediff(Time,date_sub(curdate(),INTERVAL 1 MONTH))>=0";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int Tnum = rs.getInt("Tnum");
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Type = rs.getString("Type");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				int Signal = rs.getInt("Signal");
				String Code = rs.getString("Code");
				Information i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				infos.add(i);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infos;
	}
	
	public List<Information> timelistInfos_2(){
		List<Information> infos = new ArrayList<Information>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from Information where datediff(Time,date_sub(curdate(),INTERVAL 1 MONTH))<0";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				int Tnum = rs.getInt("Tnum");
				String Snum = rs.getString("Snum");
				String Tname = rs.getString("Tname");
				String Sname = rs.getString("Sname");
				String FileName = rs.getString("FileName");
				String Type = rs.getString("Type");
				String Color = rs.getString("Color");
				Date Time = rs.getDate("Time");
				String Place = rs.getString("Place");
				String Mcontactway = rs.getString("Mcontactway");
				String Ucontactway = rs.getString("Ucontactway");
				int Signal = rs.getInt("Signal");
				String Code = rs.getString("Code");
				Information i = new Information(Tnum,Snum,Tname,Sname,FileName,Type,Color,Time,Place,Mcontactway,Ucontactway,Signal,Code);
				infos.add(i);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infos;
	}

}
