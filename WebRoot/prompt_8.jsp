<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>找回密码结果</title>
<link type="text/css" rel="stylesheet" href="css/style.css"/>
<style type="text/css">
	td{
		font-size:17px;
		font-family:微软雅黑
	}
</style>
</head>

<body style="background-image:url(image/001.jpg);background-size:100% auto">
	<table class="tablestyle2" style="margin-top:180px" align="center">
		<tr>
			<td align="center">学号</td>
			<td align="center">${Snum}</td>
		</tr>
		<tr>
			<td align="center">密码</td>
			<td align="center">${tips}</td>
		</tr>
		<tr>
			<td colspan="2" align="center"><a href="login.jsp">登录</a></td>
		</tr>
	</table>
</body>
</html>
