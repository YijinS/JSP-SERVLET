<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>파라미터 출력 </title>
</head>
<body>


	name 파라미터 값 : 
	<% try { %>
	<%= request.getParameter("name").toUpperCase() %>
	<% } catch(Exception ex){ %>
	name 파라미터가 올바르지 않습니다. 
	<% } %>
</body>
</html>