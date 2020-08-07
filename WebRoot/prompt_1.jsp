<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>申请招领结果</title>
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<style type="text/css">
			td{
				font-size:17px;
				font-family:微软雅黑
			}
		</style>
	</head>

<body>
	<table class="tablestyle2" style="margin-top:180px" align="center">
		<tr>
			<td colspan="2" align="center">${tips}</td>
		</tr>
		<tr>
			<td>失物编号：</td>
			<td>${m.tnum}</td>
		</tr>
		<tr>
			<td>验证码：</td>
			<td>${m.code}</td>
		</tr>
	</table>
</body>
</html>
