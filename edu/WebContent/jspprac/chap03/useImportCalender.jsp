<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Calender Class 사용</title>
</head>
<body>

	<% Calendar cal = Calendar.getInstance(); %>
	
	Today : 
		<%= cal.get(Calendar.YEAR) %> 년
		<%= cal.get(Calendar.MONTH) + 1 %> 월
		<%= cal.get(Calendar.DATE) %> 일</body>
</html>