<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INFO</title>
</head>
<body>
include전 name 파라미터 값 <%= request.getParameter("name") %>

<hr>

<jsp:include page="body_sub.jsp" flush="false">
	<jsp:param name="name" value="최범균" />
</jsp:include>

<hr/>

include후 name 파라미터 값 <%= request.getParameter("name") %>

</body>
</html>