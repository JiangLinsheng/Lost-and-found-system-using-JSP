package com.wit.jdbc;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class updateDemoM {
	public static void main(String[] args){
		Mthing m = new Mthing("手机","电子产品","银色","田径场","QQ:2581715324");
		m.setSnum("1405120909");
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.updateMthing(m);
		System.out.println(b);
	}

}
