<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>합 구하기</title>
</head>
<body>
<%
	int sum = 0;
	for(int i=0; i<=10; i++){
		sum += i;
	}
%>
	1부터 10 까지의 합 : <%= sum %>

</body>
</html>