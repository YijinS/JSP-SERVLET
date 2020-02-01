<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page session="true" %>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%
	Date time = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>세션 정보</title>
</head>
<body>
	session ID : <%= session.getId() %> <br>
<%
	time.setTime(session.getCreationTime());
%>
	session create time : <%= formatter.format(time) %> <br>
<%
	time.setTime(session.getLastAccessedTime());
%>
	last accessed time: <%= formatter.format(time) %>
</body>
</html>