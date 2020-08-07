package com.wit.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class queryDemoU {
	public static void main(String[] args){
		/*UserDAO udao = new UserDAO();
		User u = udao.queryUser("1405120909");
		System.out.println(u.toString());*/
		
		UserDAO udao = new UserDAO();
		List<User> users = new ArrayList<User>();
		users = udao.listUsers();
		for(int i=0;i<users.size();i++){
			System.out.println(users.get(i).toString());
		}
	}

}
