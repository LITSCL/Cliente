<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
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