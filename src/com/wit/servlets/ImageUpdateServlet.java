package com.wit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.wit.dao.MthingDAO;

public class ImageUpdateServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//����ҳ������
		int Tnum = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("Tnum", Tnum);
		request.getRequestDispatcher("imageupdate.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//����ҳ������
		int Tnum = 0;
		String fileName = null;
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
			Tnum = Integer.parseInt(mySmartUpload.getRequest().getParameter("Tnum"));
			//ȡ���ļ���(��Ϊֻ�ϴ�һ���ļ���������getFile(0))
			fileName = mySmartUpload.getFiles().getFile(0).getFileName();
			//��ȫ���ϴ��ļ����浽ָ��Ŀ¼��
			mySmartUpload.save(savepath);
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.updateFileName(Tnum, fileName);
		
		String tips = b?"<label style='color:green'>�޸ĳɹ�!</label>":"<label style='color:red'>�޸�ʧ��!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_7.jsp").forward(request, response);
	}
}
