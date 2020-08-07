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
			<table class="tablestyle1" align="center" >
					<caption style="color:white;font-family:华文行楷;font-size:30px;">失物信息列表</caption>
						<tr height="35px">
							<th>图片</th>
							<th>编号</th>
							<th>名称</th>
							<th>类型</th>
							<th>颜色</th>
							<th>拾捡时间</th>
							<th>拾捡地点</th>
							<th>失主姓名</th>
							<th>失主联系方式</th>
							<th>拾主联系方式</th>
							<th>验证码</th>
							<th>操作</th>
						</tr>
					<c:forEach items="${infos}" var="i">
					<c:if test="${i.tname ne null}">
						<tr style="height:auto">
							<td align="center">
							<a href="ImageUpdateServlet?id=${i.tnum}">
							<img src="../image/${i.fileName }" style="height:100px;width:100px"/>
							</a>
							</td>
							<td align="center">${i.tnum}</td>
							<td align="center">${i.tname}</td>
							<td align="center">${i.type}</td>
							<td align="center">${i.color}</td>
							<td align="center">${i.time}</td>
							<td align="center">${i.place}</td>
							<td align="center">${i.sname}</td>
							<td align="center">${i.ucontactway}</td>
							<td align="center">${i.mcontactway}</td>
							<td align="center">${i.code}</td>
							<td align="center">
							<c:if test="${i.tnum ne null}">
							<a href="MthingUpdateServlet?id=${i.tnum}">修改</a>
							<c:if test="${i.signal eq 0}">
							<a href="SignalUpdateServlet?id=${i.tnum}">招领</a>
							</c:if>
							<a href="MthingDeleteServlet?id=${i.tnum}" onclick="javascript : return confirm('你确定删除这个失物的信息吗？')">删除</a>
							</c:if>
							</td>
						</tr>
					</c:if>
					</c:forEach>
					<c:forEach items="${mths}" var="m">
					<c:if test="${m.tname ne null}">
						<tr style="height:auto">
							<td align="center">
							<a href="ImageUpdateServlet?id=${m.tnum}">
							<img src="../image/${m.fileName}" style="height:100px;width:100px"/>
							</a>
							</td>
							<td align="center">${m.tnum}</td>
							<td align="center">${m.tname}</td>
							<td align="center">${m.type}</td>
							<td align="center">${m.color}</td>
							<td align="center">${m.time}</td>
							<td align="center">${m.place}</td>
							<td align="center"></td>
							<td align="center"></td>
							<td align="center">${m.mcontactway}</td>
							<td align="center">${m.code}</td>
							<td align="center">
							<c:if test="${m.tnum ne null}">
							<a href="MthingUpdateServlet?id=${m.tnum}">修改</a>
							<a href="MthingDeleteServlet?id=${m.tnum}" onclick="javascript : return confirm('你确定删除这个失物的信息吗？')">删除</a>
							</c:if>
							</td>
						</tr>
					</c:if>
					</c:forEach>
			</table>
		</div>
</body>
</html>
