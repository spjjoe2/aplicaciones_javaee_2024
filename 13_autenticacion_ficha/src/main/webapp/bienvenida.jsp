<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Ficha"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
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