<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Producto,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<a href="CerrarSesion">Cerrar Sesion</a>
	<center> 
		<%List<Producto> carritoCompra=(List<Producto>)session.getAttribute("carrito"); 
		if(carritoCompra!=null){ %>
			<center>
				<h1>lista carrito  </h1>
				<table border="1">
					<tr><th>Nombre</th><th>Precio></th><th>Categoría</th></tr> 
					<%for(Producto p: carritoCompra){ %>
						<tr>
							<td><%=p.getNombre()%></td>
							<td><%=p.getPrecio()%></td>
							<td><%=p.getCategoria()%></td>
							<td><a href="EliminarCarritoServlet?nombre=<%=p.getNombre()%>">Eliminar</a></td>
						</tr>
					<%} %>
				</table>
		 
				<a href="menu.html">volver</a>
		
		<%}%>
	</center>
	
</body>
</html>