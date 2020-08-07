<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>找回密码</title>
		<script type="text/javascript">
			function check(Snum,Sname,Ucontactway){
				if(Snum.value == null||Snum.value==""){
					alert("学号不能为空！");
					return false;
				}
				if(Sname.value == null||Sname.value==""){
					alert("用户名不能为空！");
					return false;
				}
				if(Ucontactway.value == null||Ucontactway.value==""){
					alert("联系方式不能为空！");
					return false;
				}
				else{
					return true;
				}
			}
		</script>
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<style type="text/css">
			.text1{
				font-size:17px;
				font-family:微软雅黑
			}
		</style>
	</head>

<body style="background-image:url(image/001.jpg);background-size:100% auto">
	<div style="width:100%;height:auto">
		<div style="width:100%;height:auto">
			<h1>找回密码</h1>
		</div>
		<div style="width:40%;height:auto;float:right">
			<a href="index.jsp">返回首页</a>
		</div>
		<div style="width:720px;height:auto;position:absolute;top:25%;right:0;bottom:0;left:0;margin:auto">
			<form name="sregister" method="post" action="FindBackPwServlet" onsubmit = "return check(Snum,Sname,Ucontactway)">
				<table style="width:720px;height:auto">
							<tr>
								<td width="175px" align="right"><label class="text1">学号</label></td>
								<td><input type="text" class="input1" name="Snum"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">姓名</label></td>
								<td><input type="text" class="input1" name="Sname"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">联系方式</label></td>
								<td><input type="text" class="input1" name="Ucontactway"/></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input type="submit" value="找回密码" class="button1"/>
								</td>
							</tr>
							</table>
			</form>
		</div>
	</div>
</body>
</html>
