<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>管理员首页</title>
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<style type="text/css">
			*{margin:0; padding: 0;}
			 #navcont { background: white; width: 100%;}
			 #nav { font-family: helvetica; position:relative; width:1200px; height:56px; font-size:14px; color:#999; margin: 0 auto; }
			 #nav ul { list-style-type:none; }
			 #nav ul li { float:left; position: relative;}
			 #nav ul li a { border-right:1px solid #e9e9e9; padding:20px; display:block; text-decoration:none; text-align:center; color:#999;}
			 #nav ul li a:hover {background: #12aeef url(//files.jb51.net/demoimg/200912/shadow.png) repeat-x;; color:#fff;} 
			 #nav ul li ul {display: none;}
			 #nav ul li:hover ul {display: block; position: absolute; top:56px; min-width:190px; left:0;} 
			 #nav ul li:hover ul li a {display:block; background:#12aeef; color:#ffffff; width: 110px; text-align: center; border-bottom: 1px solid #f2f2f2; border-right: none;}
			 #nav ul li:hover ul li a:hover { background:#6dc7ec; color:#ffffff; }
			 .borderleft {border-left: 1px solid #e9e9e9;}
			 .top { border-top: 1px solid #f2f2f2;}
			 /*  This piece of code is for a third level drop down menu and is not included in this tutorial  #nav ul 
			li:hover ul li ul {display:none;}
			 #nav ul li:hover ul li:hover ul {display:block; position: absolute; top:-1px; left: 151px;}*/
			 /* Ignore this last piece of code */
		</style>
	</head>

<body style="background-image:url(image/001.jpg);background-size:100% auto">
	<div style="width:100%;height:auto;margin:auto">
			<div style="width:100%;height:auto">
				<h1>管理员首页</h1>
			</div>
			<div id="navcont"> 
				<div id="nav"> 
					<ul>
					 <li class="borderleft"><a href="upload.jsp">上传失物</a></li>
					 <li><a href="AllInfoListServlet" target="tb">全部失物</a></li>
					 <li><a>招领状态</a>
					  <ul>
					   <li class="top"><a href="NoInfoListServlet" target="tb">未招领</a></li>
					   <li><a href="IngInfoListServlet" target="tb">招领中</a></li>
					   <li><a href="YesInfoListServlet" target="tb">已招领</a></li>
					  </ul>
					 </li> 
					 <li><a>失物类型</a>
					   <ul>
					    <li class="top"><a href="<c:url value="/TypeInfoListServlet?Type=电子产品"/>" target="tb">电子产品</a></li>
					    <li><a href="<c:url value="/TypeInfoListServlet?Type=证件卡片"/>" target="tb">证件卡片</a></li>
					    <li><a href="<c:url value="/TypeInfoListServlet?Type=包"/>" target="tb">包</a></li>
					    <li><a href="<c:url value="/TypeInfoListServlet?Type=钥匙"/>" target="tb">钥匙</a></li>
					    <li><a href="<c:url value="/TypeInfoListServlet?Type=衣物"/>" target="tb">衣物</a></li>
					    <li><a href="<c:url value="/TypeInfoListServlet?Type=书籍"/>" target="tb">书籍</a></li>
					    <li><a href="<c:url value="/TypeInfoListServlet?Type=其他"/>" target="tb">其他</a></li>
					   </ul>
					 </li>
					 <li><a>丢失时间</a>
					   <ul>
					    <li class="top"><a href="<c:url value="/TimeInfoListServlet?Time=inaweek"/>" target="tb">一周内</a></li>
					    <li><a href="<c:url value="/TimeInfoListServlet?Time=inamonth"/>" target="tb">一月内</a></li>
					    <li><a href="<c:url value="/TimeInfoListServlet?Time=overamonth"/>" target="tb">一月前</a></li>
					   </ul>
					 </li>
					 <li>
					 	<div style="width:auto;height:20px;margin-top:18px">
						 	<form method="post" action="TnumInfoListServlet" target="tb">
								<label>失物编号</label>
								<input type=text style="width:30px" name="Tnum"/>
								<input type="submit" value="查询" />
							</form>
						</div>
					 </li>
					 <li><a href="UserListServlet" target="tb">全部用户</a></li>
					 <li>
					 	<div style="width:auto;height:20px;margin-top:18px">
						 	<form method="post" action="SnumUserListServlet" target="tb">
								<label>用户学号</label>
								<input type=text style="width:70px" name="Snum"/>
								<input type="submit" value="查询" />
							</form>
						</div>
					 </li>
					 <li><a href="index.jsp">用户首页</a></li>
					 <li>
					 	<% 
							%><a href="UserUpdateServlet"><%= session.getAttribute("Sname")%></a><% 
						%>
					 </li>
					 <li><a href="logout.jsp">注销</a></li>
					 <li><a href="aregister.jsp">注册</a></li>
					</ul>
				</div>
			</div>
			<div style="width:100%;height:auto">
				<iframe name="tb" style="width:100%;height:720px" frameborder="0"></iframe>
			</div>
		</div>
</body>
</html>
