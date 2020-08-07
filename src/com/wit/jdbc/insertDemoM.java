package com.wit.jdbc;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class insertDemoM {
	public static void main(String[] args){
		Mthing m = new Mthing("大衣","衣物","灰色","田径场","QQ:2581715324");
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.insertMthing(m);
		System.out.println(b);
	}

}
