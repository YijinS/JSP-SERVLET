<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>forTokens 태그</title>
</head>
<body>
콤마와 점을 구분자로 사용: <br>
<c:forTokens var="token" items="빨강색, 노란색.주황색.초록색,파란색,남색.보라색" delims=",.">
${token}
</c:forTokens>
</body>
</html>