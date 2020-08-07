package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class SnumUserListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String Snum = request.getParameter("Snum");
		
		UserDAO udao = new UserDAO();
		List<User> users = new ArrayList<User>();
		User u = udao.queryUser(Snum);
		users.add(u);
		
		request.setAttribute("users",users);
		
		request.getRequestDispatcher("table_3.jsp").forward(request, response);
	}

	

}
