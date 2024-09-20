<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%int contador=(Integer)session.getAttribute("contador");
	int global=(Integer)application.getAttribute("global");
	int sesionesActivas=(Integer)application.getAttribute("sesionesActivas");%>
	<center>
		<h1>Has entrado <%=contador%> veces</h1>
		<h2>Total de visitantes <%=global%> </h2>
		<h2>Usuarios activos<%=sesionesActivas%> </h2>
		
		<%String fecha ="";
		Cookie[] todas = request.getCookies();
		if(todas!=null){
			for(Cookie ck: todas){
				if(ck.getName().equals("fechaVisita")){
					fecha=ck.getValue();
				}
			}
			
		}%>
		
	 <h2>Fecha ultima visita: <%=fecha%></h2>
		<br>
		<a href="entrada.html">Volver</a>
	</center>
</body>
</html>