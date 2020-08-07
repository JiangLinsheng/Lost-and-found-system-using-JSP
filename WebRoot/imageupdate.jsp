<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>修改失物图片</title>
<link type="text/css" rel="stylesheet" href="css/style.css"/>
<style type="text/css">
	.text1{
		font-size:17px;
		font-family:微软雅黑
	}
</style>
</head>

<body>
	<div style="width:100%;height:auto;margin:auto">
		<div style="width:100%;height:auto">
			<h2>修改失物图片</h2>
		</div>
		<div style="width:100%;height:auto">
			<form method="post" action="ImageUpdateServlet" enctype="multipart/form-data">
				<table style="width:720px;height:auto" align="center">
					<tr>
						<td width="175px" align="right"><label class="text1">失物编号</label></td>
						<label>
						<td>
							${Tnum}<input type="hidden" class="input1" name="Tnum"  value="${Tnum}" required="required"/>
						</label>
						</td>
					</tr>
					<tr>
						<td width="175px" align="right"><label class="text1">失物图片</label></td>
						<td><input type="file" class="input1" name="upfile"/></td>
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
