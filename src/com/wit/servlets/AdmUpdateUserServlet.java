package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.User;
import com.wit.dao.UserDAO;

public class AdmUpdateUserServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		String Snum = request.getParameter("id");
		/*if(Snum == null)
			Snum = (String) request.getSession().getAttribute("Snum");*/
		UserDAO udao = new UserDAO();
		User u = udao.queryUser(Snum);
		
		request.setAttribute("u", u);
		
		request.getRequestDispatcher("updateuser.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String Snum = request.getParameter("Snum");
		String Password = request.getParameter("Password");
		String Sname = request.getParameter("Sname");
		String Ucontactway = request.getParameter("Ucontactway");
		String Actor = request.getParameter("Actor");
		
		User u = new User(Snum,Password,Sname,Ucontactway,Actor);
		UserDAO udao = new UserDAO();
		boolean b = udao.updateUser(u);
		
		String tips = b?"<label style='color:green'>修改成功!</label>":"<label style='color:red'>修改失败!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_7.jsp").forward(request, response);
	}

	

}
