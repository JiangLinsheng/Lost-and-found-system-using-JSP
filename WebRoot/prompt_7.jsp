<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>修改失物结果或管理员修改其他用户信息结果</title>
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
			<td align="center">${tips}</td>
		</tr>
	</table>
</body>
</html>
