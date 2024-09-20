<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<a href="CerrarSesion">Cerrar Sesion</a>
	<center> 
    <c:choose>
		<c:when test ="${not empty sessionScope.carrito}">
			<center>
				<h1>lista carrito  </h1>
				<table border="1">
					<tr><th>Nombre</th><th>Precio></th><th>Categoría</th></tr> 
					 
					<c:forEach var= "pr" items= "${sessionScope.carrito}">
						<tr>
							<td>${pr.nombre}</td>
							<td>${pr.precio}</td>
							<td>${pr.categoria}%></td>
							<td><a href="EliminarCarritoServlet?nombre=${pr.nombre}">Eliminar</a></td>
						</tr>
					</c:forEach> 
				</table>
			</c:when>	
			<c:otherwhise>
				<h1> El carrito está vacío</h1>
			</c:otherwhise>
		</c:choose>c:when>	
		 </center>
		<a href="menu.html">volver</a>
	
	</center>
	
</body>
</html>