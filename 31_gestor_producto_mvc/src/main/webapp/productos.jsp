<%@page import="model.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" >
</head>
<body>
	<h2>Productos de ${param.categoria} </h2>
	<table border="1">
		<tr>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>
		
		<c:forEach var="p" items="${requestScope.productos}">
			<tr>
				<td>${p.nombre}</td>
				<td>${p.precio}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="FrontController?operation=toInicio">Volver a home</a>
</body>
</html> 