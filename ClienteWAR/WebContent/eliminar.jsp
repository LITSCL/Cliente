<%@page import="javax.naming.InitialContext"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="cl.inacap.clienteejb.business.ServicioLocal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%! ServicioLocal servicioLocal; %>

<%
InitialContext ctx = new InitialContext();
servicioLocal = (ServicioLocal)ctx.lookup("java:global/ClienteEAR/ClienteEJB/Servicio!cl.inacap.clienteejb.business.ServicioLocal");
%>

<c:set var="servicio" scope="page" value="<%=servicioLocal%>" />

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

	<p>Rut a eliminar: ${param.rut}</p>
	<p>¿Esta seguro que desea eliminar?</p>
	<a href="ClienteControlador?rut=${param.rut}&boton=2">Si</a>
	<a href="index.jsp">No</a> ${mensaje}
</body>
</html>

