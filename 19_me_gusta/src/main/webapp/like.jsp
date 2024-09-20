<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="paisaje.jpg">
	&nbsp;&nbsp;
	 
	<table>

	 <tr>
	 <td>
	<a href="ContadorServlet?pulgar=arriba">
		&#128077;
	</a>
	</td>
	<td>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="ContadorServlet?pulgar=abajo">
		&#128078;
	</a>
	</td> 
	</tr>
	<tr>
	<td>
		 
		<%=application.getAttribute("pulgarArriba")!=null?application.getAttribute("pulgarArriba"):0%>
 	</td> 
 	<td>
		<%=application.getAttribute("pulgarAbajo")!=null?application.getAttribute("pulgarAbajo"):0%>
	</td>
	</table>
 
 

</body>
</html>