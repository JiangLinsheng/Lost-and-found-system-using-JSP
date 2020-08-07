package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wit.dao.MthingDAO;

public class SignalUpdateServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//����ҳ������
		int Tnum = Integer.parseInt(request.getParameter("id"));
		
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.updateSignal(Tnum);
		
		String tips = b?"<label style='color:green'>����ɹ�!</label>":"<label style='color:red'>����ʧ��!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_7.jsp").forward(request, response);
	}

	

}
