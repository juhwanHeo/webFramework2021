<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>등록된 내용</title>
</head>
<body>
	<h1>등록된 내용</h1>
	
	<form action="std_update.do">
		<input name="seq" value="${msg.seq}" type="hidden">
		<table>
			<tr><td>아이디 : </td><td><input name="id" value="${msg.id}"></td></tr>
			<tr><td>이름 : </td><td><input name="name" value="${msg.name}"></td></tr>
			<tr><td>나이 : </td><td><input name="age" value="${msg.age}"></td></tr>
		</table>
		<input value="수정" type="submit">
	</form>
	<a href="std_delete.do?seq=${msg.seq}">${msg.name}삭제</a>
</body> 
</html>
