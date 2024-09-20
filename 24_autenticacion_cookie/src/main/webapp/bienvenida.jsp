<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Ficha"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<meta http-equiv="Expires" content="0">
	<meta http-equiv="Last-Modified" content="0">
	<meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
	<meta http-equiv="Pragma" content="no-cache">
	
</head>
<body> 
<center>
	<a href="Desconectar">Desconectar</a> (borrar la cookie usuario)
</center>
	<%-- Recuperamos el atributo de petición Ficha y mostramos sus datos al cliente --%>
	<%
	Ficha ficha =(Ficha)request.getAttribute("ficha");
	%>
	<h2> nombre:   <%=ficha.getNombre()%></h2>
	<h2> email:   <%=ficha.getEmail()%></h2>
	<h2> edad:   <%=ficha.getEdad()%></h2> 		 
	<a href='login.html'>Volver</a></body></html>  
</body>
</html>