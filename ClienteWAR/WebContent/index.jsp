<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inicio</title>
</head>
<body>
	<h1>Opciones</h1>
	<hr/>
	<ul>
		<li><a href="index.jsp">Agregar</a></li>
		<li><a href="mostrar.jsp">Mostrar</a></li>
		<li><a href="listado.jsp">Eliminar/Modificar</a></li>
	</ul>
	<hr/>

	<form action="ClienteControlador" method="GET">
		<label for="rut">Rut</label> 
		<input type="text" name="rut" required><br/>
		
		<label for="nombre">Nombre</label> 
		<input type="text" name="nombre" required><br/> 
		
		<label for="apellidoPaterno">Apellido Paterno</label> 
		<input type="text" name="apellidoPaterno" required><br/>
		
		<label for="apellidoMaterno">Apellido Materno</label> 
		<input type="text" name="apellidoMaterno" required><br/>

		<button type="submit" value="1" name="boton">Agregar</button>
	</form>

</body>
</html>