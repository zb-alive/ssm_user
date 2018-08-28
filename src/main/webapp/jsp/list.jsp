<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="border: 2px solid red;">
		<c:forEach items="${userList }" var="u">
			<tr>
				<td>${u.userName }</td>
				<td>${u.userPassword }</td>
				<td>${u.userDate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>