<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>view 페이지</title>
</head>
<body>
<%
	String code = request.getParameter("code");
	String viewPageURI = null;
	
	if(code.equals("A")){
		viewPageURI = "viewModule/a.jsp";
	}else if(code.equals("B")){
		viewPageURI = "viewModule/b.jsp";
	}else if(code.equals("C")){
		viewPageURI = "viewModule/c.jsp";
	}

%>
<jsp:forward page="<%= viewPageURI %>" />

</body>
</html>