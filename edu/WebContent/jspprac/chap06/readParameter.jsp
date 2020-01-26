<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page errorPage = "error/viewErrorMessage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>파라미터 출력</title>
</head>
<body>

	
	name 파라미터 값 : <%= request.getParameter("name").toUpperCase() %>
	
</body>
</html>