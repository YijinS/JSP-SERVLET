<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String memberId = (String)session.getAttribute("MEMBERID");
	boolean login = memberId == null? false : true;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 여부 검사</title>
</head>
<body>
<%
	if(login){
%>
 ID "<%= memberId %>" 로 로그인 한 상태
 <%
	}else{
 %>
 로그인하지 않은 상태
 <% } %>
</body>
</html>