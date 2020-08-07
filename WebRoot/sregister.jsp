<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"/>
		<title>学生注册</title>
		<script type="text/javascript">
			function check(Snum,Sname,Ucontactway,Password,Rpassword,agree){
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
				if(Rpassword.value == null||Rpassword.value==""){
					alert("请确认密码！");
					return false;
				}
				if(Password.value != Rpassword.value){
					alert("两次输入密码不一致！");
					return false;
				}
				if(!sregister.agree.checked){
					alert("请阅读并同意相关服务条款和隐私政策！");
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
			<h1>学生注册</h1>
		</div>
		<div style="width:40%;height:auto;float:right">
			<a href="index.jsp">返回首页</a>
		</div>
		<div style="width:720px;height:auto;position:absolute;top:25%;right:0;bottom:0;left:0;margin:auto">
			<form name="sregister" method="post" action="UserAddServlet" onsubmit = "return check(Snum,Sname,Ucontactway,Password,Rpassword,agree)">
				<table style="width:720px;height:auto">
							<tr>
								<td width="175px" align="right"><label class="text1">学号</label></td>
								<td><input type="text" class="input1" name="Snum" placeholder="10位数字" onchange="if(/\D/.test(this.value)){alert('学号只能为数字');this.value=' ';} if(this.value.length!=10){alert('学号长度必须为10');this.value=' ';}"/></td>
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
								<td width="175px" align="right"><label class="text1">密码</label></td>
								<td><input type="password" class="input1" name="Password" placeholder="6-16个字符,包括数字、字母或符号" onchange="if(this.value.length<6||this.value.length>16){alert('密码长度为6-16位');this.value=' ';}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">确认密码</label></td>
								<td><input type="password" class="input1" name="Rpassword"/></td>
							</tr>
							<tr>
								<td></td>
								<td><input type="hidden" class="input1" name="Actor" value="student"/></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input type="submit" value="立即注册" class="button1"/>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input type="radio" value="open" name="agree"/>
								<a href="privacy.jsp">我已阅读并同意相关服务条款和隐私政策</a>
								</td>
							</tr>
							</table>
			</form>
		</div>
	</div>
</body>
</html>
