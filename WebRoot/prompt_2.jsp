<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>注册结果</title>
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
			<td colspan="2" align="center">${tips}</td>
		</tr>
		<tr>
			<td align="center"><a href="login.jsp">登录</a></td>
		</tr>
	</table>
</body>
</html>
