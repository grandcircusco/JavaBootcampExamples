<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Demo</title>
</head>
<body>
	<form action="/add-result">
		<p>Number 1: <input type="number" name="num1" /> </p>
		<p>Number 2: <input type="number" name="num2" /> </p>
		<p><button type="submit">Add</button></p>
	</form>
</body>
</html>