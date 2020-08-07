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

public class TimeInfoListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String s = request.getParameter("Time");
		
		InfoDAO idao = new InfoDAO();
		List<Information> infos = new ArrayList<Information>();
		MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = new ArrayList<Mthing>();
		
		if(s.equals("inaweek")){
			infos = idao.timelistInfos_0();
			mths = mdao.listMthings_0(-1);
		}
		else if(s.equals("inamonth")){
			infos = idao.timelistInfos_1();
			mths = mdao.listMthings_1(-1);
		}
		else if(s.equals("overamonth")){
			infos = idao.timelistInfos_2();
			mths = mdao.listMthings_2(-1);
		}
		
		request.setAttribute("infos", infos);
		request.setAttribute("mths", mths);
		
		request.getRequestDispatcher("table_2.jsp").forward(request, response);
	}

	

}
