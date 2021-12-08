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
			<th>대학명</th>
			<th>전형</th>
			<th>최소 수시 점수</th>
			<th>최소 수능 점수</th>
			<th>기타</th>
		</tr>
		<c:forEach var="item" items="${collegeExamList}">
		<tr>
			<td>${item.college_nm}</td> 
			<td>${item.exam_type_nm}</td>
			<td>${item.min_score}</td>
			<td>${item.min_csat_score}</td>
			<td><a href="${pageContext.request.contextPath}/project/college/exam/student/list.do?college_id=${item.college_id}&exam_type=${item.exam_type}">학생 보기</a></td>
			
		<tr>
		</c:forEach>
	</table>
</body> 
</html>
