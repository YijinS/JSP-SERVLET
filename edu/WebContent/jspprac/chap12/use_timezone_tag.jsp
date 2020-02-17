<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>timeZone 태그 사용</title>
</head>
<body>

<c:set var="now" value="<%= new java.util.Date() %>" />

<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" />
<br>
<fmt:timeZone value="Hongkong">
<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/>
</fmt:timeZone>

</body>
</html>