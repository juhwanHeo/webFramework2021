<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>등록된 내용</title>
</head>
<body>
	<h1>
		등록된 내용
	</h1>
	
	<table>
		<tr><td>아이디 : </td><td>${msg.id}</td></tr>
		<tr><td>이름 : </td><td>${msg.name}</td></tr>
		<tr><td>나이 : </td><td>${msg.age}</td></tr>
	</table>
</body> 
</html>
