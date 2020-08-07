<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>登录</title>
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<style type="text/css">
			.textstyle1{font-size:12px;color:blue;margin-left:5px;font-family:微软雅黑}
			.textstyle2{font-size:14px;color:black;font-family:微软雅黑}
			.text1{font-size:17px;font-family:微软雅黑}
		</style>
		<script type="text/javascript">
			function check(Snum,Password){
				if(Snum.value == null||Snum.value==""){
						alert("学号不能为空！");
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
	</head>

<body style="background-image:url(image/001.jpg);background-size:100% auto">
	<form method="post" action="LoginServlet" onsubmit="return check(Snum,Password)">
			<table background="image/002.jpg" width="350px" cellspacing="0" style="background-size:100% 100%;height:250px;border:1px solid pink;margin-top:180px" align="center">
				<tr style="height:90px">
					<td colspan="2" align="center">
						<label style="font-family:华文行楷;font-size:xx-large;color:#0066FF">高校失物招领系统</label>	
					</td>
				</tr>
				<tr style="height:40px">
					<td style="width:80px" align="right">
						<label class="text1">学号</label>
					</td>
					<td>
						<input type="text" style="color:#666666" name="Snum" class="input2"/>
						<a href="sregister.jsp" class="textstyle1">注册账号</a>
					</td>
				</tr>
				<tr style="height:40px">
					<td style="width:80px" align="right">
						<label class="text1">密码</label>
					</td>
					<td>
						<input type="password" style="color:#666666" name="Password" class="input2"/>
						<a href="findbackpw.jsp" class="textstyle1">找回密码</a>
					</td>
				</tr>
				<tr style="height:100px;height:40px">
					<td colspan="2" align="center">
						<input type="radio" name="Actor" value="student" checked="checked">
							<label class="textstyle2">学生</label>
						<input type="radio" name="Actor" value="admin">
							<label class="textstyle2">管理员</label>
					</td>
				</tr>
				<tr style="height:40px">
					<td colspan="2">
						<input type="submit" value="登 录" style="width:150px;margin-left:98px;background-color:#42A6F0;color:white"/>
					</td>
				</tr>
			</table>
		</form>
</body>
</html>

