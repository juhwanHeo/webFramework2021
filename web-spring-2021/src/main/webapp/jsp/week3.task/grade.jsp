<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP 예제 : grade.jsp</title>
</head>
<body>
    <h2>JavaBeans를 이용한 학생의 점수에 따른 성적 처리 예제</h2>
    <% request.setCharacterEncoding("euc-kr");%>
    <jsp:useBean id="score" class="com.week3.task.GradeBean" scope="page"/>

    <hr>
    <h3>폼에서 전달받은 이름과 성적을 JavaBeans GradeBean에 저장</h3>
    이름: <%= request.getParameter("name")%>
    성적: <%= request.getParameter("point")%>
    <jsp:setProperty name="score" property="name" param="name"/>
    <jsp:setProperty name="score" property="point" param="point"/>

    <hr>
    <h3>JavaBeans GradeBean에 저장된 정보를 조회 출력</h3>
    이름: <jsp:getProperty name="score" property="name"/>
    성적: <jsp:getProperty name="score" property="point"/>
    등급: <jsp:getProperty name="score" property="grade"/>
</body>
</html>
