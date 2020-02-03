<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="chap11.Thermometer" %>
<%
	Thermometer thermometer = new Thermometer();
	request.setAttribute("t", thermometer);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>온도 변환 예쩨</title>
</head>
<body>
	${t.setCelsius('서울', 27.3) }
	서울 온도: 섭씨 ${t.getCelsius('서울')}도 / 화씨 ${t.getFahrenheit('서울') }
	
	<br/>
	정보: ${t.info}
</body>
</html>