<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>뮤직 top200</h1>
	<table width=800 border=1 bordercolor=black>
		<tr>
			<th></th>
			<th>title</th>
			<th>singer</th>
			<th>album</th>
		</tr>
		<c:forEach var="vo" items="${list}">
		<tr>
			<td><img src="${vo.poster}" width=30 height=30></td>
			<td>${vo.title}</td>
			<td>${vo.singer}</td>
			<td>${vo.album} </td>
		</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>