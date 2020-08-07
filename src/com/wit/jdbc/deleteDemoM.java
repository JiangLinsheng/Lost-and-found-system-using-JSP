package com.wit.jdbc;

import com.wit.dao.MthingDAO;

public class deleteDemoM {
	public static void main(String[] args){
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.deleteMthing(2);
		System.out.println(b);
	}

}
