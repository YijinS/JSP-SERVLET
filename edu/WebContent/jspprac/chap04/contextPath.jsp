<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page buffer="1kb" autoFlush="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>웹 어플리케이션 경로 구하기 </title>
</head>
<body>

 web application path : <%= request.getContextPath() %>
</body>
</html>