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
		//接受页面数据
		String Tname = null;//request.getParameter("Tname");
		String Type = null;//request.getParameter("Type");
		String Color = null;//request.getParameter("Color");
		String Sdate = null;//request.getParameter("Time");
		String Place = null;//request.getParameter("Place");
		String Mcontactway = null;//request.getParameter("Mcontactway");
		
		Date Time = new Date(0);
		String fileName = null;
		/*//取得整个web应用的物理根路径（注意不是jsp项目根路径）
		String root = request.getSession().getServletContext().getRealPath("/");*/
		//设置上传文件的保存路径（绝对路径/物理路径www.mwcly.cn）
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
			Tname = mySmartUpload.getRequest().getParameter("Tname");
			Type = mySmartUpload.getRequest().getParameter("Type");
			Color = mySmartUpload.getRequest().getParameter("Color");
			Sdate = mySmartUpload.getRequest().getParameter("Time");
			Place = mySmartUpload.getRequest().getParameter("Place");
			Mcontactway = mySmartUpload.getRequest().getParameter("Mcontactway");
			Time = Date.valueOf(Sdate);
			//取得文件名(因为只上传一个文件，所以用getFile(0))
			fileName = mySmartUpload.getFiles().getFile(0).getFileName();
			//将全部上传文件保存到指定目录下
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
		
		String tips = b?"<label style='color:green'>添加失物成功!</label>":"<label style='color:red'>添加失物失败!</label>";
		request.setAttribute("tips", tips);
		request.getRequestDispatcher("prompt_4.jsp").forward(request, response);

		
	}

	

}
