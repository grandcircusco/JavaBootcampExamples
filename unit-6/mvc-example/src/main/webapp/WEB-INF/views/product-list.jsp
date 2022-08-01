<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>
</head>
<body>
	<h1>Products</h1>
	<p>
		<a href="/products-search">Search By Category</a>
	</p>
	<table>
		<tr>
			<th>Name</th>
			<th>Price</th>
			<th>Category</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
		 		<td>${ product.name }</td>
		 		<td>${ product.price }</td>
		 		<td>${ product.category }</td>
		 	</tr>
		</c:forEach>
	</table>
</body>
</html>