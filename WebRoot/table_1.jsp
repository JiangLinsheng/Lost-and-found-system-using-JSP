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
		<title>失物信息表</title>
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
			<table style="width:100%;align:center">
					<caption style="color:white;font-family:华文行楷;font-size:30px;">失物信息列表</caption>
						<tr height="35px">
							<th>图片</th>
							<th>名称</th>
							<th>类型</th>
							<th>颜色</th>
							<th>拾捡时间</th>
							<th>拾捡地点</th>
							<th>拾主联系方式</th>
							<th>操作</th>
						</tr>
					<c:forEach items="${mths}" var="m">
						<tr style="height:auto">
							<td align="center"><img src="../image/${m.fileName }" style="height:100px;width:100px"/></td>
							<td align="center">${m.tname}</td>
							<td align="center">${m.type}</td>
							<td align="center">${m.color}</td>
							<td align="center">${m.time}</td>
							<td align="center">${m.place}</td>
							<td align="center">${m.mcontactway}</td>
							<c:if test="${m.signal eq -1}">
							<td align="center">
							<%
							if(session.getAttribute("Sname")==null){
								%>登录后可申请招领<%
							}
							else{
								%><a href="ApplyServlet?id=${m.tnum}">申请招领</a><%
							}
							 %>
							</td>
							</c:if>
							<c:if test="${m.signal eq 0}">
							<td align="center">招领中</td>
							</c:if>
							<c:if test="${m.signal eq 1}">
							<td align="center">已招领</td>
							</c:if>
						</tr>
					</c:forEach>
			</table>
		</div>
	</body>
</html>
