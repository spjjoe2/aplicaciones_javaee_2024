<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<center> ;
		<h2>El usuario <%=request.getParameter("username")%></h2> 
		<h2>con contraseña <%=request.getParameter("password")%></h2> 
		<h2>No es correcto</h2> 
		<a href='login.html'>Volver</a></body></html> 
	 </center>
</body>
</html>