package com.wit.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import com.wit.beans.Mthing;
import com.wit.utils.Character;
import com.wit.utils.DBManager;

public class MthingDAO {
		public boolean insertMthing(Mthing m){
			boolean flag = false;
			try{
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "insert into Mthing(Snum,Tname,Type,Color,Time,Place,Mcontactway,FileName,Signal,Code) values(null,?,?,?,?,?,?,?,-1,?)";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1,m.getTname());
				ps.setString(2,m.getType());
				ps.setString(3,m.getColor());
				ps.setDate(4,(Date) m.getTime());
				ps.setString(5, m.getPlace());
				ps.setString(6, m.getMcontactway());
				ps.setString(7, m.getFileName());
				ps.setString(8, Character.getRandomString(6));
				
				int i = ps.executeUpdate();
				flag = i>0?true:false;
				
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			return flag;
		}
		
		public boolean deleteMthing(int Tnum){
			boolean flag = false;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "delete from Mthing where Tnum=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1,Tnum);
				
				int i = ps.executeUpdate();
				flag = i>0?true:false;
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
		
		public boolean updateMthing(Mthing m){
			boolean flag = false;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "update Mthing set Snum=?,Tname=?,Type=?,Color=?,Time=?,Place=?,Mcontactway=?,Signal=? where Tnum=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, m.getSnum());
				ps.setString(2,m.getTname());
				ps.setString(3, m.getType());
				ps.setString(4, m.getColor());
				ps.setDate(5, m.getTime());
				ps.setString(6, m.getPlace());
				ps.setString(7, m.getMcontactway());
				ps.setInt(8, m.getSignal());
				ps.setInt(9, m.getTnum());
				
				
				int i = ps.executeUpdate();
				flag = i>0?true:false;
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return flag;
		}
		
		public boolean updateSignal(int Tnum){
			boolean flag = false;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "update Mthing set Signal=1 where Tnum=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setInt(1,Tnum);
				
				
				int i = ps.executeUpdate();
				flag = i>0?true:false;
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return flag;
		}
		
		public boolean updateSignal(int Tnum,String Snum){
			boolean flag = false;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "update Mthing set Signal=0,Snum=? where Tnum=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, Snum);
				ps.setInt(2,Tnum);
				
				
				int i = ps.executeUpdate();
				flag = i>0?true:false;
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return flag;
		}
		
		public boolean updateFileName(int Tnum,String FileName){
			boolean flag = false;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "update Mthing set FileName=? where Tnum=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, FileName);
				ps.setInt(2,Tnum);
				
				
				int i = ps.executeUpdate();
				flag = i>0?true:false;
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			return flag;
		}
		
		public Mthing queryMthing(int Tnum){
			Mthing m = null;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where Tnum=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Tnum);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					int Signal = rs.getInt("Signal");
					String Code = rs.getString("Code");
					m = new Mthing(Tnum,Snum,Tname, Type, Color, Time,Place,Mcontactway,FileName,Signal,Code);
					
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return m;
			
		}
		
		public Mthing queryMthing(int Tnum,int Signal){
			Mthing m = null;
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where Tnum=? AND Signal=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Tnum);
				ps.setInt(2, Signal);
				
				ResultSet rs = ps.executeQuery();
				if(rs.next()){
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					String Code = rs.getString("Code");
					m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return m;
			
		}
		
		public List<Mthing> listMthings(String Type,int Signal){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where Type=? AND Signal=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, Type);
				ps.setInt(2, Signal);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
		
		public List<Mthing> listMthings(){
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					int Signal = rs.getInt("Signal");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
		
		public List<Mthing> listMthings(String Type){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where Type=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, Type);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					int Signal = rs.getInt("Signal");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color, Time,Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}

		public List<Mthing> listMthings(int Signal){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where Signal=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Signal);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}

		public List<Mthing> listMthings_0(){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where datediff(Time,date_sub(curdate(),INTERVAL 7 DAY))>=0";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					int Signal = rs.getInt("Signal");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
		
		public List<Mthing> listMthings_1(){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where datediff(Time,date_sub(curdate(),INTERVAL 1 MONTH))>=0";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					int Signal = rs.getInt("Signal");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}

		public List<Mthing> listMthings_2(){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where datediff(Time,date_sub(curdate(),INTERVAL 1 MONTH))<0";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					int Signal = rs.getInt("Signal");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
		
		public List<Mthing> listMthings_0(int Signal){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where datediff(Time,date_sub(curdate(),INTERVAL 7 DAY))>=0 AND Signal=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Signal);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
		
		public List<Mthing> listMthings_1(int Signal){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where datediff(Time,date_sub(curdate(),INTERVAL 1 MONTH))>=0 AND Signal=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Signal);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
		
		public List<Mthing> listMthings_2(int Signal){
			
			List<Mthing> mths = new ArrayList<Mthing>();
			try {
				java.sql.Connection conn = DBManager.getConn();
				
				String sql = "select * from Mthing where datediff(Time,date_sub(curdate(),INTERVAL 1 MONTH))<0 AND Signal=?";
				
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setInt(1, Signal);
				
				ResultSet rs = ps.executeQuery();
				while(rs.next()){
					int Tnum = rs.getInt("Tnum");
					String Snum = rs.getString("Snum");
					String Tname = rs.getString("Tname");
					String Type = rs.getString("Type");
					String Color = rs.getString("Color");
					Date Time = rs.getDate("Time");
					String Place = rs.getString("Place");
					String Mcontactway = rs.getString("Mcontactway");
					String FileName = rs.getString("FileName");
					String Code = rs.getString("Code");
					Mthing m = new Mthing(Tnum,Snum,Tname, Type, Color,Time, Place,Mcontactway,FileName,Signal,Code);
					mths.add(m);
				}
				
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return mths;
		}
}