package com.wit.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class queryDemoM {
	public static void main(String[] args){
		/*MthingDAO mdao = new MthingDAO();
		Mthing m = mdao.queryMthing(1);
		System.out.println(m.toString());*/
		
		MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = new ArrayList<Mthing>();
		mths = mdao.listMthings();
		for(int i=0;i<mths.size();i++){
			System.out.println(mths.get(i).toString());
		}
		
		/*MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = new ArrayList<Mthing>();
		mths = mdao.listMthings("电子产品");
		for(int i=0;i<mths.size();i++){
			System.out.println(mths.get(i).toString());
		}*/
		
		/*MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = new ArrayList<Mthing>();
		mths = mdao.listMthings(-1);
		for(int i=0;i<mths.size();i++){
			System.out.println(mths.get(i).toString());
		}*/
	}

}
