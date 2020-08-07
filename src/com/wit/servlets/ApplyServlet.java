package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class ApplyServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		int Tnum = Integer.parseInt(request.getParameter("id"));
		
		String Snum = (String) request.getSession().getAttribute("Snum");
		MthingDAO mdao = new MthingDAO();
		Mthing m = mdao.queryMthing(Tnum);
		boolean b = mdao.updateSignal(Tnum, Snum);
		
		String tips = b?"<label style='color:green'>申请招领成功!请凭学生证或身份证到学校失物招领处领取失物。</label>":"<label style='color:red'>申请招领失败!</label>";
		request.setAttribute("tips", tips);
		request.setAttribute("m", m);
		request.getRequestDispatcher("prompt_1.jsp").forward(request, response);
	}

	

}
