package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class UserAddServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		String Snum = request.getParameter("Snum");
		String Sname = request.getParameter("Sname");
		String Ucontactway = request.getParameter("Ucontactway");
		String Password = request.getParameter("Password");
		String Actor = request.getParameter("Actor");
		
		User u = new User(Snum,Password,Sname,Ucontactway,Actor);
		
		UserDAO udao = new UserDAO();
		boolean b = udao.insertUser(u);
		
		String tips = b?"<label style='color:green'>注册成功!</label>":"<label style='color:red'>注册失败!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_2.jsp").forward(request, response);
		
	}

	

}
