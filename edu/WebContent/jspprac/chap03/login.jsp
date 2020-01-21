<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%
	String id = request.getParameter("memberId");
	if (id != null && id.equals("madvirus")){
		response.sendRedirect("../chap03/index.jsp");
	}else{
%>
<html>
<head>
<meta charset="utf-8">
<title>리다이렉트</title>
</head>
<body>

	 잘못된 아이디 입니다.

</body>
</html>
<% } %>