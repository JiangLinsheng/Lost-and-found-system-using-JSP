package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.dao.MthingDAO;

public class MthingDeleteServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		int Tnum = Integer.parseInt(request.getParameter("id"));
		
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.deleteMthing(Tnum);
		
		String tips = b?"<label style='color:green'>删除成功!</label>":"<label style='color:red'>删除失败!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_5.jsp").forward(request, response);
	}

	

}
