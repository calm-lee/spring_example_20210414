<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>조건문 (c:choose, c:when, c:otherwise)</h1>
	<%-- 몸무게가 70 이하면 치킨, 80 이하면 샐러드, 그 이상이면 굶기 --%>
	
	<c:set var="weight" value="75" />
	
	<c:choose>
		<c:when test="${weight <= 70}">
			치킨
		</c:when>
		<c:when test="${weight <= 80}">
			샐러드
		</c:when>
		<c:otherwise>
			굶기
		</c:otherwise>
	</c:choose>
	
</body>
</html>