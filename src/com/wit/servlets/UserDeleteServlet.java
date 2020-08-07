package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.dao.UserDAO;

public class UserDeleteServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String Snum = request.getParameter("id");
		
		UserDAO udao = new UserDAO();
		boolean b = udao.deleteUser(Snum);
		
		String tips = b?"<label style='color:green'>É¾³ý³É¹¦!</label>":"<label style='color:red'>É¾³ýÊ§°Ü!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_5.jsp").forward(request, response);
	}

	

}
