<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>上传失物</title>
<script type="text/javascript" src="js/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	function check(Tname,Type,Time){
		if(Tname.value == null||Tname.value==""){
			alert("名称不能为空！");
			return false;
		}
		if(Type.value == null||Type.value==""){
			alert("类型不能为空！");
			return false;
		}
		if(Time.value == null||Time.value==""){
			alert("时间不能为空！");
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
			<h1>上传失物</h1>
		</div>
		<div style="width:40%;height:auto;float:right">
			<a href="admhp.jsp">返回首页</a>
		</div>
		<div style="width:720px;height:auto ;position:absolute;top:25%;right:0;bottom:0;left:0;margin:auto">
			<form method="post" action="MthingAddServlet" onsubmit = "return check(Tname,Type,Time)" enctype="multipart/form-data">
				<table style="width:720px;height:auto">
							<tr>
								<td width="175px" align="right"><label class="text1">名称</label></td>
								<td><input type="text" class="input1" name="Tname"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">类型</label></td>
								<td>
								<select class="input1" name="Type">
									<option value="电子产品">电子产品</option>
									<option value="证件卡片">证件卡片</option>
									<option value="包">包</option>
									<option value="钥匙">钥匙</option>
									<option value="衣物">衣物</option>
									<option value="书籍">书籍</option>
									<option value="其他">其他</option>
								</select>
								</td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">颜色</label></td>
								<td><input type="text" class="input1" name="Color"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">拾捡时间</label></td>
								<td>
								<input class="Wdate input1" type="text" name="Time" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd'})"/>
								</td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">拾捡地点</label></td>
								<td><input type="text" class="input1" name="Place"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">联系方式</label></td>
								<td><input type="text" class="input1" name="Mcontactway"/></td>
							</tr>
				
							<tr>
								<td width="175px" align="right"><label class="text1">失物图片</label></td>
								<td><input type="file" class="input1" name="upfile"/></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
								<input type="submit" name="Submit" value="上传" class="button1"/>
								</td>
							</tr>
							</table>
			</form>
		</div>
	</div>
</body>
</html>
