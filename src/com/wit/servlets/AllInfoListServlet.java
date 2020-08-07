package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.Information;
import com.wit.beans.Mthing;
import com.wit.dao.InfoDAO;
import com.wit.dao.MthingDAO;

public class AllInfoListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据

		InfoDAO idao = new InfoDAO();
		List<Information> infos = idao.listInfos();
		MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = mdao.listMthings(-1);
		
		request.setAttribute("infos", infos);
		request.setAttribute("mths", mths);
		
		request.getRequestDispatcher("table_2.jsp").forward(request, response);
	}

	

}
