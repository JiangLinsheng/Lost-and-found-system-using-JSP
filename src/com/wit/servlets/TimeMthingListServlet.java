package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class TimeMthingListServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String s = request.getParameter("Time");
		
		MthingDAO mdao = new MthingDAO();
		List<Mthing> mths = new ArrayList<Mthing>();
		
		if(s.equals("inaweek")){
			mths = mdao.listMthings_0();
		}
		else if(s.equals("inamonth")){
			mths = mdao.listMthings_1();
		}
		else if(s.equals("overamonth")){
			mths = mdao.listMthings_2();
		}
		
		request.setAttribute("mths", mths);
		
		request.getRequestDispatcher("table_1.jsp").forward(request, response);
	}

	

}
