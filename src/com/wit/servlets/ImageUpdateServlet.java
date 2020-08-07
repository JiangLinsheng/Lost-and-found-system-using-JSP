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
		//接受页面数据
		int Tnum = Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("Tnum", Tnum);
		request.getRequestDispatcher("imageupdate.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		//接受页面数据
		int Tnum = 0;
		String fileName = null;
		String savepath = "E:\\image\\";
		//声明SmartUpload类对象
		SmartUpload mySmartUpload = new SmartUpload();
		
		try {
			//初始化的方法必须先执行
			//参数：config,request,response都是jsp内置对象
			mySmartUpload.initialize(getServletConfig(), request, response);
			//上传文件数据
			mySmartUpload.upload();
			//以下接收数据的部分必须在mySmartUpload.upload();这句之后
			Tnum = Integer.parseInt(mySmartUpload.getRequest().getParameter("Tnum"));
			//取得文件名(因为只上传一个文件，所以用getFile(0))
			fileName = mySmartUpload.getFiles().getFile(0).getFileName();
			//将全部上传文件保存到指定目录下
			mySmartUpload.save(savepath);
		} catch (SmartUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MthingDAO mdao = new MthingDAO();
		boolean b = mdao.updateFileName(Tnum, fileName);
		
		String tips = b?"<label style='color:green'>修改成功!</label>":"<label style='color:red'>修改失败!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_7.jsp").forward(request, response);
	}
}
