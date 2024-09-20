package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("FrontControler")
public class FrontControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String urlVista="";
		 String operation = request.getParameter("operation");
		 urlVista = switch(operation) {
			 case "doAgregar" ->{
				 request.getRequestDispatcher("AgregarCarritoAction").include(request,response);
					 yield "menu.html" ;
			 }
			 case "doEliminar" ->{
				 request.getRequestDispatcher("EliminarCarritoAction").include(request,response);
					 yield  "carrito.jsp" ;
			 }
			 case "doCerrar" ->{
				 request.getRequestDispatcher("CerrarSesionAction").include(request,response);
					 yield  "menu.jsp" ;	
			 }
			 case "toAlta" -> "alta.html";
			 case "toCarrito" ->"carrito.jsp";
		     default -> "menu.html";
			 };
		     // transferimos ocntrol a vista definitigva
		     request.getRequestDispatcher(urlVista).forward(request, response);
	}

}
