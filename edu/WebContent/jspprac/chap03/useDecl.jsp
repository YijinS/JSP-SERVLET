<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%!
	public int multiply(int a, int b){
	int c = a * b;
	return c;
}
%>

<html>
<head>
<meta charset="utf-8">
<title>선언부 사용</title>
</head>
<body>
	
	10 * 25 = <%= multiply(10,25) %>

</body>
</html>