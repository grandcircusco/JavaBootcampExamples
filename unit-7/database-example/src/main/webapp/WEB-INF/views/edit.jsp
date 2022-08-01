<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Rooms</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Rooms at Grand Circus</h1>
		<form action="/rooms/edit" method="post">
		<input type="hidden" name="id" value="${room.id}" />
		<table class="table">
			<tr>
				<th scope="row">Name</th>
				<td><input type="text" name="name" value="${room.name}" /></td>
			</tr>
			<tr>
				<th scope="row">Max Capacity</th>
				<td><input type="number" name="maxCapacity" value="${room.maxCapacity}" /></td>
			</tr>
			<tr>
				<th scope="row">Available</th>
				<td>
					<%-- <input id="available-yes" type="radio" name="available" value="true" ${room.available ? "checked" : ""} />
					<label for="available-yes">Yes</label>
					<input id="available-no" type="radio" name="available" value="false" ${!room.available ? "checked" : ""} />
					<label for="available-no">No</label> --%>
					<input id="available" type="checkbox" name="available" value="true" ${room.available ? "checked" : ""} />
					<label for="available">Available?</label>
				</td>
			</tr>
		</table>
		<button type="submit" class="btn btn-primary">Save Changes</button>
		<a class="btn link" href="/rooms/detail?id=${room.id}">Cancel</a>
		</form>
	</div>
</body>
</html>