<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rooms</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link href="/temp.css" rel="stylesheet" /> 
</head>
<body>
	<div class="container">
		<h1>Rooms at Grand Circus</h1>
		
	<form class="form-inline" action="/rooms">
	  <label class="sr-only" for="inlineFormInputName2">Needed Capacity</label>
	  <input name="neededCapacity" type="number" class="form-control mb-2 mr-sm-2" id="inlineFormInputName2" placeholder="Needed Capacity">
	
	  <div class="form-check mb-2 mr-sm-2">
	    <input name="onlyShowAvailable" value="true" class="form-check-input" type="checkbox" id="inlineFormCheck">
	    <label class="form-check-label" for="inlineFormCheck">
	      Only show available
	    </label>
	  </div>
	
	  <button type="submit" class="btn btn-primary mb-2">Filter</button>
	</form>
		
		<table class="table">
			<thead>
				<tr>
					<th>Room</th><th>Max Capacity</th><th>Available</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="classroom" items="${rooms}">
				<tr>
					<td><a href="/rooms/detail?id=${classroom.id}">${classroom.name}</a></td>
					<td>${classroom.maxCapacity}</td>
					<td>${classroom.available ? "Yes" : "No" }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="/rooms/add" class="btn btn-secondary">Add Room</a>
	</div>
</body>
</html>