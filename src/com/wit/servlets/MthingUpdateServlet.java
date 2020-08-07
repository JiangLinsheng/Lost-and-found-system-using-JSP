package com.wit.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class MthingUpdateServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		int Tnum = Integer.parseInt(request.getParameter("id"));
		
		MthingDAO mdao = new MthingDAO();
		Mthing m = mdao.queryMthing(Tnum);
		
		request.setAttribute("m", m);
		
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		
		int Tnum = Integer.parseInt(request.getParameter("Tnum"));
		String Tname = request.getParameter("Tname");
		String Snum = request.getParameter("Snum");
		String Type = request.getParameter("Type");
		String Color = request.getParameter("Color");
		String Sdate = request.getParameter("Time");
		Date Time = Date.valueOf(Sdate);
		String Place = request.getParameter("Place");
		String Mcontactway = request.getParameter("Mcontactway");
		int Signal = Integer.parseInt(request.getParameter("Signal"));
		
		Mthing m = new Mthing(Tnum,Snum,Tname,Type,Color,Time,Place,Mcontactway,Signal);
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.updateMthing(m);
		
		String tips = b?"<label style='color:green'>修改成功!</label>":"<label style='color:red'>修改失败!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_7.jsp").forward(request, response);
	}

	

}
