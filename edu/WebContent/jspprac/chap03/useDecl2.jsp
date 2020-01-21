<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%!
	public int add(int a, int b){
	int c = a + b;
	return c;
	}

	public int sub(int a, int b){
	int c = a - b;
	return c;
	}	
%>

<html>
<head>
<meta charset="utf-8">
<title>스크립트릿에서 선언부 사용</title>
</head>
<body>
<%
	int val1 = 3;
	int val2 = 9;
	
	int addResult = add(val1, val2);
	int subResult = sub(val1, val2);

%>

<%= val1 %> + <%= val2 %> = <%=addResult %>
<%= val1 %> - <%= val2 %> = <%=subResult %>

</body>
</html>