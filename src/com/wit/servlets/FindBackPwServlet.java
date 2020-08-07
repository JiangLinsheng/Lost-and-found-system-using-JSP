package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class FindBackPwServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String Snum = request.getParameter("Snum");
		String Sname = request.getParameter("Sname");
		String Ucontactway = request.getParameter("Ucontactway");
		String Password = null;
		String tips = null;
		
		UserDAO udao = new UserDAO();
		User u = udao.queryUser(Snum);
		
		if(u.getSname().equals(Sname) && u.getUcontactway().equals(Ucontactway)){
			Password = u.getPassword();
		}
		
		if(Password == null){
			tips = "输入信息有误";
		}
		else{
			tips = Password;
		}
		
		request.setAttribute("tips", tips);
		request.setAttribute("Snum", Snum);
		request.getRequestDispatcher("prompt_8.jsp").forward(request, response);
	}

	
}
