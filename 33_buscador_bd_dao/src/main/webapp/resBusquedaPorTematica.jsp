<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Resultado,java.util.List"%>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<%-- recuperamos la lista de resultados --%>
	  

  	<h2>Resultados de búsqueda por ${param.tematica} </h2>
	<table border="1">
		<tr>
			<th>Url</th>
			<th>Tematica</th>
			<th>Descripcion</th>
			
		</tr>
		
		<c:forEach var="res" items="${requestScope.listResultados}">
			<tr>
				<td>${res.url}</td>
				<td>${res.tematica}</td>
				<td>${res.descripcion}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="FrontController?operation=toMenu">Volver</a>
  	
  	
  	
  	
  	
  		 
	 
	 
</body>
</html>