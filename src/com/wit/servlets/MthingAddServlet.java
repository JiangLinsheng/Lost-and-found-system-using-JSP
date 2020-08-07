package com.wit.servlets;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.wit.beans.Mthing;
import com.wit.dao.MthingDAO;

public class MthingAddServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//����ҳ������
		String Tname = null;//request.getParameter("Tname");
		String Type = null;//request.getParameter("Type");
		String Color = null;//request.getParameter("Color");
		String Sdate = null;//request.getParameter("Time");
		String Place = null;//request.getParameter("Place");
		String Mcontactway = null;//request.getParameter("Mcontactway");
		
		Date Time = new Date(0);
		String fileName = null;
		/*//ȡ������webӦ�õ������·����ע�ⲻ��jsp��Ŀ��·����
		String root = request.getSession().getServletContext().getRealPath("/");*/
		//�����ϴ��ļ��ı���·��������·��/����·��www.mwcly.cn��
		String savepath = "E:\\image\\";
		//����SmartUpload�����
		SmartUpload mySmartUpload = new SmartUpload();
		
		try {
			//��ʼ���ķ���������ִ��
			//������config,request,response����jsp���ö���
			mySmartUpload.initialize(getServletConfig(), request, response);
			//�ϴ��ļ�����
			mySmartUpload.upload();
			//���½������ݵĲ��ֱ�����mySmartUpload.upload();���֮��
			Tname = mySmartUpload.getRequest().getParameter("Tname");
			Type = mySmartUpload.getRequest().getParameter("Type");
			Color = mySmartUpload.getRequest().getParameter("Color");
			Sdate = mySmartUpload.getRequest().getParameter("Time");
			Place = mySmartUpload.getRequest().getParameter("Place");
			Mcontactway = mySmartUpload.getRequest().getParameter("Mcontactway");
			Time = Date.valueOf(Sdate);
			//ȡ���ļ���(��Ϊֻ�ϴ�һ���ļ���������getFile(0))
			fileName = mySmartUpload.getFiles().getFile(0).getFileName();
			//��ȫ���ϴ��ļ����浽ָ��Ŀ¼��
			mySmartUpload.save(savepath);
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Time = (Date) dataFormat.parse(Sdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		Mthing m = new Mthing(Tname,Type,Color,Time,Place,Mcontactway,fileName);
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.insertMthing(m);
		
		String tips = b?"<label style='color:green'>���ʧ��ɹ�!</label>":"<label style='color:red'>���ʧ��ʧ��!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_4.jsp").forward(request, response);

		
	}

	

}
