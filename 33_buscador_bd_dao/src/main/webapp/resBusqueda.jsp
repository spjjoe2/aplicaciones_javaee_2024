<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Resultado"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<%-- recuperamos la lista de resultados --%>
	  
	<h2>URL: ${requestScope.resultado.url }</h2>
	<h2>Tematica: ${requestScope.resultado.tematica }</h2>
	<h2>Descripcion: ${requestScope.resultado.descripcion }</h2>
	<a href="FrontController?operation=toMenu">Volver a home</a>
	 
	 
</body>
</html>

 
 

 