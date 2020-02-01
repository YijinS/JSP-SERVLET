<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="member" scope="request" class="chap08.member.MemberInfo" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>usebean 객체 생성</title>
</head>
<body>
<%
	member.setId("madvirus");
	member.setName("최범균");
%>
<jsp:forward page="useObject.jsp" />
</body>
</html>