<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>등록된 내용</title>
</head>
<body>
	<h1>리스트 화면</h1>
	
	<table border="1">
		<tr>
			<th>순서</th>
			<th>아이디</th>
			<th>성명</th>
			<th>나이</th>
		</tr>
		<c:forEach var="item" items="${std_cmd}">
		<tr>
			<td><a href="std_list.do?seq=${item.seq}">${item.seq}</a></td>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.age}</td>
		<tr>
		</c:forEach>
	</table>
</body> 
</html>
