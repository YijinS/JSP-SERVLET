<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	if(id.equals(password)){
		session.setAttribute("MEMBERID", id);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login success</title>
</head>
<body>

	로그인에 성공했습니다. 
	

</body>
</html>
<% } else{ 
	
%>
<script>

alert("로그인에 실패했습니다. ");
history.go(-1);
</script>
<% } %>