<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>修改失物信息</title>
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

<body>
	<div style="width:100%;height:auto;margin:auto">
		<div style="width:100%;height:auto">
			<h2>修改失物信息</h2>
		</div>
		<div style="width:100%;height:auto">
			<form method="post" action="MthingUpdateServlet" onsubmit = "return check(Tname,Type,Time)">
				<table style="width:720px;height:auto" align="center">
							<tr>
								<td width="175px" align="right"><label class="text1">失物编号</label></td>
								<label>
								<td>
								${m.tnum}<input type="hidden" class="input1" name="Tnum"  value="${m.tnum}" required="required"/>
								</label>
								</td>
				
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">失物名称</label></td>
								<td><input type="text" class="input1" name="Tname"  value="${m.tname}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">失主学号</label></td>
								<td><input type="text" class="input1" name="Snum"  value="${m.snum}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">失物类型</label></td>
								<td>
								<select class="input1" name="Type">
									<option selected="selected" value="${m.type}">${m.type}</option>
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
								<td width="175px" align="right"><label class="text1">失物颜色</label></td>
								<td><input type="text" class="input1" name="Color"  value="${m.color}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">拾捡时间</label></td>
								<td>
								<input class="Wdate input1" type="text" name="Time" value="${m.time}" onClick="WdatePicker({el:this,dateFmt:'yyyy-MM-dd'})"/>
								</td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">拾捡地点</label></td>
								<td><input type="text" class="input1" name="Place"  value="${m.place}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">拾主联系方式</label></td>
								<td><input type="text" class="input1" name="Mcontactway"  value="${m.mcontactway}"/></td>
							</tr>
							<tr>
								<td width="175px" align="right"><label class="text1">标志位</label></td>
								<td>
								<select class="input1" name="Signal">
									<option selected="selected" value="${m.signal}">${m.signal}</option>
									<option value=-1>-1</option>
									<option value=0>0</option>
									<option value=1>1</option>
								</select>
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
