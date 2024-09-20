<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Resultado,java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
	<%-- recuperamos la lista de resultados --%>
	<%	List<Resultado>  resultados = (List<Resultado>)request.getAttribute("tematica"); 
	 if (resultados!=null&resultados.size()>0){  
		
	      for (Resultado r : resultados){ %>
	    	<h2><a href="<%=r.getUrl()%>"><%=r.getUrl()%></a></h2>
	    	<h2> tematica:   <%=r.getTematica()%></h2>
	    	<h2> comentario:   <%=r.getComentario()%></h2> 		
		<%}%>
	<%} %>
	<br>
  		 
	<a href='buscador.html'>Volver</a></body></html> 
	 
</body>
</html>

 
 

 