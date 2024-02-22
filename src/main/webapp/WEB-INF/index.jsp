<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Manager</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<h1 class="text-center">Customer Manager</h1>

			<span> ${error} </span>

			<table class="table table-hover table-bordered mx-auto">
				<thead>
					<tr>
						<th scope="col">CusId</th>
						<th scope="col">CusUser</th>
						<th scope="col">CusPass</th>
						<th scope="col">CusName</th>
						<th scope="col">CusPhone</th>
						<th scope="col">CusAdd</th>
						<th scope="col">CusEmail</th>
						<th scope="col">CusFacebook</th>
						<th scope="col">CusSkyper</th>
						<th scope="col">CusStatus</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listCustomer}" var="cus">
						<tr>
							<td>${cus.cusId}</td>
							<td>${cus.cusUser}</td>
							<td>${cus.cusPass}</td>
							<td>${cus.cusName}</td>
							<td>${cus.cusPhone}</td>
							<td>${cus.cusAdd}</td>
							<td>${cus.cusEmail}</td>
							<td>${cus.cusFacebook}</td>
							<td>${cus.cusSkyper}</td>
							<td>${cus.cusStatus}</td>
							<td><a
								href="CustomerController?action=edit&cusId=${cus.cusId}">Edit</a>
								<a href="CustomerController?action=delete&cusId=${cus.cusId}">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"></script>
</body>
</html>