package com.wit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.wit.beans.Mthing;
import com.wit.beans.User;
import com.wit.utils.DBManager;

public class UserDAO {
	public boolean insertUser(User u){
		boolean flag = false;
		try{
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "insert into User(Snum,Password,Sname,Ucontactway,Actor) values(?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,u.getSnum());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getSname());
			ps.setString(4,u.getUcontactway());
			ps.setString(5,u.getActor());
			
			int i = ps.executeUpdate();
			flag = i>0?true:false;
			
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean deleteUser(String Snum){
		boolean flag = false;
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "delete from User where Snum=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,Snum);
			
			int i = ps.executeUpdate();
			flag = i>0?true:false;
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public boolean updateUser(User u){
		boolean flag = false;
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "update User set Password=?,Sname=?,Ucontactway=?,Actor=? where Snum=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, u.getPassword());
			ps.setString(2, u.getSname());
			ps.setString(3, u.getUcontactway());
			ps.setString(4, u.getActor());
			ps.setString(5,u.getSnum());
			
			
			int i = ps.executeUpdate();
			flag = i>0?true:false;
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return flag;
	}
	
	public User queryUser(String Snum){
		User u = null;
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from User where Snum=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Snum);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				String Password = rs.getString("Password");
				String Sname = rs.getString("Sname");
				String Ucontactway = rs.getString("Ucontactway");
				String Actor = rs.getString("Actor");
				u = new User(Snum,Password,Sname, Ucontactway,Actor);
				
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
		
	}
	
	public List<User> listUsers(){
		List<User> users = new ArrayList<User>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from User";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String Snum = rs.getString("Snum");
				String Password = rs.getString("Password");
				String Sname = rs.getString("Sname");
				String Ucontactway = rs.getString("Ucontactway");
				String Actor = rs.getString("Actor");
				User u = new User(Snum,Password,Sname, Ucontactway,Actor);
				users.add(u);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public List<User> listUsers(String Actor){
		List<User> users = new ArrayList<User>();
		try {
			java.sql.Connection conn = DBManager.getConn();
			
			String sql = "select * from User where Actor=?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, Actor);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String Snum = rs.getString("Snum");
				String Password = rs.getString("Password");
				String Sname = rs.getString("Sname");
				String Ucontactway = rs.getString("Ucontactway");
				User u = new User(Snum,Password,Sname, Ucontactway,Actor);
				users.add(u);
			}
			
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
}
