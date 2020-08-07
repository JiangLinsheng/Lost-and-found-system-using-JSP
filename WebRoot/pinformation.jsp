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
		<title>用户信息</title>
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<script type="text/javascript">
			function check(Snum,Sname,Ucontactway,Password){
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
				if(Password.value == null||Password.value==""){
					alert("密码不能为空！");
					return false;
				}
				else{
					return true;
				}
			}
		</script>
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
			<h1>用户信息</h1>
		</div>
		<div style="width:40%;height:auto;float:right">
			<%  
				if(session.getAttribute("Actor").equals("admin")){
					%><a href="admhp.jsp">返回首页</a><%
				}
				else{
					%><a href="index.jsp">返回首页</a><%
				}
			%>
		</div>
		<div style="width:720px;height:auto;position:absolute;top:25%;right:0;bottom:0;left:0;margin:auto">
			<form method="post" action="UserUpdateServlet" onsubmit = "return check(Snum,Sname,Ucontactway,Password)">
				<table style="width:720px;height:auto">
							<tr>
								<td width="175px" align="right"><label class="text1">学号</label></td>
								<td><label>${u.snum}<input type="hidden" name="Snum" value="${u.snum}" class="input1" required="required" /></label></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">姓名</label></td>
								<td><input type="text" name="Sname"  value="${u.sname}" class="input1"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">密码</label></td>
								<td><input type="text" class="input1" name="Password"  value="${u.password}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">联系方式</label></td>
								<td><input type="text" class="input1" name="Ucontactway"  value="${u.ucontactway}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">角色</label></td>
								<td>
								<%  
								if(session.getAttribute("Actor").equals("admin")){
									%>
									<select class="input1" name="Actor">
										<option selected="selected" value="${u.actor}">${u.actor}</option>
										<option value="student">student</option>
										<option value="admin">admin</option>
									</select>
									<%
								}
								else{
									%><label>${u.actor}<input type="hidden" class="input1" name="Actor"  value="${u.actor}"/></label><%
								}
								%>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input type="submit" value="确认修改" class="button1"/>
								</td>
							</tr>
							</table>
			</form>
		</div>
	</div>
</body>
</html>
