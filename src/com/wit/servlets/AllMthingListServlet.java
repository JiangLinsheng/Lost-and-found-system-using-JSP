package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class AllMthingListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//接受页面数据

		MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = mdao.listMthings();
		
		request.setAttribute("mths", mths);
		
		request.getRequestDispatcher("table_1.jsp").forward(request, response);
	}

	
}
