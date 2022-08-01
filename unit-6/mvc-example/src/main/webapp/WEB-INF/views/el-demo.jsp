<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Demo</title>
</head>
<body>
	<h1>JSP &amp; Expression Language Demo</h1>

	<h2>Simple EL</h2>
	<h3>${title}</h3>
 	<a href="${link}">Click Me</a>
 	
 	<h2>Dot Notation</h2>
	<h3>Room: ${room}</h3>
	<p>Length: ${dimensions.length}</p>
	<p>Width: ${dimensions.width}</p>
	
	<h2>Loop</h2>
	<ul>
	  <c:forEach items="${pets}" var="pet">
	    <li>${pet}</li>
	  </c:forEach>
	</ul>
	
	<h2>If</h2>
	<p>
		<c:if test="${dayTime}">
		  Good Day!
		</c:if>
		<c:if test="${not dayTime}">
		  Good Night!
		</c:if>
	</p>
	<p>
		<c:if test="${not empty bananas}">
		  We have bananas.
		</c:if>
		<c:if test="${empty bananas}">
		  We have no bananas!
		</c:if>
	</p>
</body>
</html>