<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>등록된 내용</title>
</head>
<body>
	<h1>대학 정보</h1> 
	
	<table border="1">
		<tr>
			<th>대학명</th>
			<th>전형</th>
			<th>최소 수시 점수</th>
			<th>최소 수능 점수</th>
		</tr>
		<tr>
			<td>${collegeExam.college_nm}</td> 
			<td>${collegeExam.exam_type_nm}</td>
			<td>${collegeExam.min_score}</td>
			<td>${collegeExam.min_csat_score}</td>
		<tr>
	</table>
	
	<h1>전체 학생 정보</h1> 
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>학생이름</th>
			<th>전형</th>
			<th>수시 점수</th>
			<th>수능 점수</th>
			<th>합격여부</th>
		</tr>
		<c:forEach var="item" items="${examStudentList}">
		<tr>
			<td>${item.id}</td> 
			<td>${item.name}</td>
			<td>${item.exam_type_nm}</td>
			<td>${item.score}</td>
			<td>${item.csat_score}</td>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
	
	<h1>통과 학생 정보</h1> 
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>학생이름</th>
			<th>전형</th>
			<th>수시 점수</th>
			<th>수능 점수</th>
			<th>합격여부</th>
		</tr>
		<c:forEach var="item" items="${passList}">
		<tr>
			<td>${item.id}</td> 
			<td>${item.name}</td>
			<td>${item.exam_type_nm}</td>
			<td>${item.score}</td>
			<td>${item.csat_score}</td>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
	
	<h1>불통과 학생 정보</h1> 
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>학생이름</th>
			<th>전형</th>
			<th>수시 점수</th>
			<th>수능 점수</th>
			<th>합격여부</th>
		</tr>
		<c:forEach var="item" items="${failList}">
		<tr> 
			<td>${item.id}</td> 
			<td>${item.name}</td>
			<td>${item.exam_type_nm}</td>
			<td>${item.score}</td>
			<td>${item.csat_score}</td>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
</body> 
</html>
