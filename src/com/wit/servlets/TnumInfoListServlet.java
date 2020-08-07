package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.Information;
import com.wit.beans.Mthing;
import com.wit.dao.InfoDAO;
import com.wit.dao.MthingDAO;

public class TnumInfoListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		int Tnum = Integer.parseInt(request.getParameter("Tnum"));
		
		InfoDAO idao = new InfoDAO();
		List<Information> infos = new ArrayList<Information>();
		Information i = idao.queryInfo(Tnum);
		infos.add(i);
		MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = new ArrayList<Mthing>();
		Mthing m = mdao.queryMthing(Tnum, -1);
		mths.add(m);
		
		request.setAttribute("infos", infos);
		request.setAttribute("mths", mths);
		
		request.getRequestDispatcher("table_2.jsp").forward(request, response);
	}

	

}
