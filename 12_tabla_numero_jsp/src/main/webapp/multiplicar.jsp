<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
		<%int numero=Integer.parseInt(request.getParameter("numero"));%>
		<h1>Tabla del <%=numero %></h1>
		<table border="1">
			<%for(int i=1;i<=10;i++){ %>
				<td><%=numero %>X<%=i %></td>
				<td><%=numero*i%></td>
			<%} %>
		</table>
		<br>
		<a href="inicio.html">volver</a>
	</center> 

</body>
</html>
 