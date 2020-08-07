<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>用户信息表</title>
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<style>
			table{
			border-collapse:collapse;//表格单元格间距样式
			border:1px solid white;
			}
			tr{border:1px solid white;}
			td{border:1px solid white;font-family:微软雅黑}
			th{font-family:微软雅黑}
		</style>
	</head>

	<body>
		<div style="width:100%;height:auto">
			<table class="tablestyle1" align="center" >
					<caption style="color:white;font-family:华文行楷;font-size:30px;">用户信息列表</caption>
						<tr height="35px">
							<th>学号</th>
							<th>姓名</th>
							<th>密码</th>
							<th>联系方式</th>
							<th>角色</th>
							<th>操作</th>
						</tr>
					<c:forEach items="${users}" var="u">
						<tr>
							<td align="center">${u.snum}</td>
							<td align="center">${u.sname}</td>
							<td align="center">${u.password}</td>
							<td align="center">${u.ucontactway}</td>
							<td align="center">${u.actor}</td>
							<td align="center">
							<a href="AdmUpdateUserServlet?id=${u.snum}">修改</a>
							<a href="UserDeleteServlet?id=${u.snum}">删除</a>
							</td>
						</tr>
					</c:forEach>
			</table>
		</div>
	</body>
</html>
