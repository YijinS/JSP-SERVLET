<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>INFO</title>
</head>
<body>
<table width="100%" border="1" cellpadding="0" cellspacing="0">
<tr>
	<td>제품번호</td> <td>XXXX</td>
</tr>
</table>

<jsp:include page="infoSub.jsp" flush="false" >
	<jsp:param name="type" value="A" />
</jsp:include>
</body>
</html>