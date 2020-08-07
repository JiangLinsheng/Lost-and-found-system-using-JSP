package com.wit.jdbc;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class insertDemoU {
	public static void main(String[] args){
		User u = new User("1405120909","jls19960707","½­ÁÖÉý","QQ:2581715324","admin");
		UserDAO udao = new UserDAO();
		boolean b = udao.insertUser(u);
		System.out.println(b);
	}

}
