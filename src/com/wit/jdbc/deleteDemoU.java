package com.wit.jdbc;

import com.wit.dao.UserDAO;

public class deleteDemoU {
	public static void main(String[] args){
		UserDAO udao = new UserDAO();
		boolean b = udao.deleteUser("1405120901");
		System.out.println(b);
	}

}
