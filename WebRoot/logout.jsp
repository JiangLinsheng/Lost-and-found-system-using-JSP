<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <title>注销</title>
	<meta charset="UTF-8">
  </head>
  
  <body>
    <%
    	session.invalidate();
    	response.sendRedirect("index.jsp");
     %>
  </body>
</html>
