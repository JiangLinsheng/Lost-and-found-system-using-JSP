package com.wit.jdbc;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class updateDemoU {
	public static void main(String[] args){
		User u = new User("1405120909","jls19960707","½­Î°","QQ:2581715324");
		UserDAO udao = new UserDAO();
		boolean b = udao.updateUser(u);
		System.out.println(b);
	}

}
