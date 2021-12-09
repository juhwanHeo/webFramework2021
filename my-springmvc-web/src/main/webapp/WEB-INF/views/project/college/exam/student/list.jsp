<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
	<title>등록된 내용</title>
	
<style>
.std-bujung {
	background-color: #ef476ece;
	
} 

.std-pass {
	background-color: #06d6a0;
}
.std-fail {
	background-color: #FFC107;
}
</style>
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
			<c:choose>
				<c:when test="${item.score ge collegeExam.min_score }">
				<td class="std-pass">${item.score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.score}</td>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${item.csat_score le collegeExam.min_csat_score }">
				<td class="std-pass">${item.csat_score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.csat_score}</td>
				</c:otherwise>
			</c:choose>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
	
	<h1>합격 학생 정보</h1> 
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
			<c:choose>
				<c:when test="${item.score ge collegeExam.min_score }">
				<td class="std-pass">${item.score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.score}</td>
				</c:otherwise>
			</c:choose>
			<c:choose>
				<c:when test="${item.csat_score le collegeExam.min_csat_score }">
				<td class="std-pass">${item.csat_score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.csat_score}</td>
				</c:otherwise>
			</c:choose>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
	
	<h1>불합격 학생 정보</h1> 
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
		
		<c:choose>
			<c:when test="${item.entrance_yn == 'Y'}">
			<tr class="std-bujung">
			</c:when>
			<c:otherwise>
			<tr> 
			</c:otherwise>
		</c:choose>
			<td>${item.id}</td> 
			<td>${item.name}</td>
			<td>${item.exam_type_nm}</td>
			<c:choose>
				<c:when test="${item.score ge collegeExam.min_score }">
				<td class="std-pass">${item.score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.score}</td>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${item.csat_score le collegeExam.min_csat_score }">
				<td class="std-pass">${item.csat_score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.csat_score}</td>
				</c:otherwise>
			</c:choose>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
	
	<h1>부정입학 의심 학생 정보</h1> 
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>학생이름</th>
			<th>전형</th>
			<th>수시 점수</th>
			<th>수능 점수</th>
			<th>합격여부</th>
		</tr>
		<c:forEach var="item" items="${bujungList}">
		<tr class="std-bujung">
			<td>${item.id}</td> 
			<td>${item.name}</td>
			<td>${item.exam_type_nm}</td>
			<c:choose>
				<c:when test="${item.score ge collegeExam.min_score }">
				<td class="std-pass">${item.score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.score}</td>
				</c:otherwise>
			</c:choose>
			
			<c:choose>
				<c:when test="${item.csat_score le collegeExam.min_csat_score }">
				<td class="std-pass">${item.csat_score}</td>
				</c:when>
				<c:otherwise>
				<td class="std-fail">${item.csat_score}</td>
				</c:otherwise>
			</c:choose>
			<td>${item.entrance_yn}</td>
		<tr>
		</c:forEach>
	</table>
	
	
	<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/project/item/home.jsp"/> 
</body> 
</html>
