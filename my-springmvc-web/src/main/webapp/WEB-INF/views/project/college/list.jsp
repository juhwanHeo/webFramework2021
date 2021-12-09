<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>등록된 내용</title>
</head>
<body>
	<h1>대학 리스트 화면</h1> 
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>대학명</th>
		</tr>
		<c:forEach var="item" items="${collegeList}">
		<tr>
			<td><a href="${pageContext.request.contextPath}/project/college/exam/list.do?college_id=${item.college_id}">${item.college_id}</a></td>
			<td>${item.college_nm}</td>
		<tr>
		</c:forEach>
	</table>
</body> 
</html>
