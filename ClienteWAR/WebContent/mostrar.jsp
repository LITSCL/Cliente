<%@page import="javax.naming.InitialContext"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="cl.inacap.clienteejb.business.ServicioLocal"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<%! ServicioLocal servicioLocal; %>

<%
InitialContext ctx = new InitialContext();
servicioLocal = (ServicioLocal)ctx.lookup("java:global/ClienteEAR/ClienteEJB/Servicio!cl.inacap.clienteejb.business.ServicioLocal");
%>

<c:set var="servicio" scope="page" value="<%=servicioLocal%>" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inicio</title>
</head>
<body>
	<h1>Opciones</h1>
	<hr />
	<ul>
		<li><a href="index.jsp">Agregar</a></li>
		<li><a href="mostrar.jsp">Mostrar</a></li>
		<li><a href="listado.jsp">Eliminar/Modificar</a></li>
	</ul>
	<hr/>

	<table>
		<c:forEach items="${servicio.clientes}" var="cl">
			<tr>
				<td>${cl.rut}</td>
				<td>${cl.nombre}</td>
				<td>${cl.apellidoPaterno}</td>
				<td>${cl.apellidoMaterno}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

