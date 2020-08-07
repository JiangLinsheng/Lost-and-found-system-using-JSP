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

public class LoginServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String Snum = request.getParameter("Snum");
		String Password = request.getParameter("Password");
		String Actor = request.getParameter("Actor");
		
		List<User> users = new ArrayList<User>();
		UserDAO udao = new UserDAO();
		users = udao.listUsers(Actor);
		
		int s = 0;
		for(int i=0;i<users.size();i++){
			if(users.get(i).getSnum().equals(Snum) && users.get(i).getPassword().equals(Password)){
				s = 1;
				request.getSession().setAttribute("Snum",users.get(i).getSnum());
				request.getSession().setAttribute("Sname", users.get(i).getSname());
				request.getSession().setAttribute("Actor", users.get(i).getActor());
				if(Actor.equals("student")){
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}
				else if(Actor.equals("admin")){
					request.setAttribute("u", users.get(i));
					request.getRequestDispatcher("admhp.jsp").forward(request, response);
				}
			}
		}
		if(s==0){
			String tips = "账号或密码错误或你无此权限";
			request.setAttribute("tips", tips);
			request.getRequestDispatcher("prompt_6.jsp").forward(request, response);
		}
	}

	

}
