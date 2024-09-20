package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion=request.getParameter("operation");
		String urlVista="";
		switch(operacion) {
			case "doBuscar":
				request.getRequestDispatcher("BuscarController").forward(request, response);				 
				return;
			 
			case "doEliminar":
				request.getRequestDispatcher("EliminarController").include(request, response);
				urlVista="eliminar.jsp";
				break;
			 
			case "doGuardar":
				request.getRequestDispatcher("GuardarController").include(request, response);
				urlVista="nuevo.jsp";
				break;
			 
			case "doLogin":
				request.getRequestDispatcher("LoginController").include(request, response);				
				urlVista= (Boolean)request.getAttribute("autenticado")?"menu.html":"error.jsp";
				break;
			 
			case "doModificar":
				request.getRequestDispatcher("ModificarController").include(request, response);
				urlVista="modificar.jsp";
				break;
			 
			case "toNuevo":urlVista= "nuevo.jsp";break;
				
			case "toEliminar":urlVista="eliminar.jsp";break;
			
			case "toBuscar":urlVista="buscar.html";break;
			case "toMenu":urlVista="menu.html";break;

			case "toModificar":urlVista="modificar.jsp";break;
			default:urlVista="login.html";break;
		};
		request.getRequestDispatcher(urlVista).forward(request, response);
	}
	


}
