<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import ="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
Calendar cal = Calendar.getInstance();
request.setAttribute("time", cal);
%>
<jsp:forward page="../to/viewTime.jsp" />
</body>
</html>