<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Productos</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="container col-md-8 offset-2">
				<h1 align="center">Productos</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<h3 align="center">Formulario</h3>
				<form action="/products/add" method="post">
					<div class="form-group">
						<label for="id">ID Producto: </label>
						
							<input type="number" readonly="readonly" class="form-control" name="id" id="id" value="${product.id }">
					</div>
					<div class="form-group">
						<label for="name">Nombre: </label>
						<c:if test="${product.id==0 }">
							<input type="text" class="form-control" name="name" id="name" required="required">
						</c:if>
						<c:if test="${product.id!=0 }">
							<input type="text" class="form-control" name="name" id="name" required="required" value="${product.name }">
						</c:if>
					</div>
					<div class="form-group">
						<label for="tag">Etiqueta: </label>
						<c:if test="${product.id==0 }">
							<input type="text" class="form-control" name="tag" id="tag" required="required">
						</c:if>
						<c:if test="${product.id!=0 }">
							<input type="text" class="form-control" name="tag" id="tag" required="required" value="${product.tag }">
						</c:if>
					</div>
					<div class="form-group">
						<label for="number">Número: </label>
						<c:if test="${product.id==0 }">
							<input type="number" class="form-control" name="number" id="number" required="required">
						</c:if>
						<c:if test="${product.id!=0 }">
							<input type="number" class="form-control" name="number" id="number" required="required" value="${product.number }">
						</c:if>
					</div>
					<div class="form-group">
						<label for="amount">Existencia: </label>
						<c:if test="${product.id==0 }">
							<input type="number" class="form-control" name="amount" id="amount" required="required">
						</c:if>
						<c:if test="${product.id!=0 }">
							<input type="number" class="form-control" name="amount" id="amount" required="required" value="${product.amount}">
						</c:if>
					</div>
					<div class="form-group" align="center">
						<input type="submit" value="Crear/Modificar" class="btn btn-primary">
						<input type="reset" value="Limpiar" class="btn">
					</div>
				</form>
			</div>
			<div class="col-md-7">
				<table class="table">
					<thead><h3 align="center">Lista de productos</h3> </thead>
					<tbody>
						<tr>
							<th>ID</th>
							<th>Nombre</th>
							<th>Etiqueta</th>
							<th>Número</th>
							<th>Existencia</th>
							<th colspan="2">Actions</th>
						</tr>
						<tr>
							<td colspan="7">
								<c:if test="${empty products}">
									<h4 align="center">No existe nigún producto en la base de datos</h4>
								</c:if>
							</td>
						</tr>
						<c:if test="${not empty products}">
							<c:forEach items="${products}" var="p">
								<tr>
									<td>${p.id}</td>
									<td>${p.name }</td>
									<td>${p.tag }</td>
									<td>${p.number }</td>
									<td>${p.amount }</td>
									<td><a href="products/edit/${p.id}" class="btn btn-success">Modificar</a></td>
									<td><a href="products/delete/${p.id }" class="btn btn-danger">Eliminar</a></td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
				
			</div>
		</div>
	</div>
</body>
</html>