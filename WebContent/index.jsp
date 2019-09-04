<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">MyInventory</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active">
					<a class="nav-link" href="/MyInventory">Inicio
						<span class="sr-only">(current)</span>
					</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/MyInventory/products">Productos</a></li>
			</ul>
		</div>
	</nav>
	<section class="container">
		<div class="row">
			<div class="col-md-6 offset-3">
				<div class="card" style="margin-top:30%">	
					<div class="card-body">
						<form action="">
							<h1 class="h3 mb-3 font-weight-normal" style="text-align:center">Iniciar Sesión</h1>
							
							<div class="form-group">
								<label for="email">Correo Electrónico</label>
								<input type="text" class="form-control" name="email" id="email">
							</div>
							<div class="form-group">
								<label for="password">Contraseña</label>
								<input type="password" class="form-control" name="password" id="password">
							</div>
							<button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i>Iniciar</button>
							
							<a href="#" id="forgot_pswd" >¿Olvidaste tu contraseña?</a>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>