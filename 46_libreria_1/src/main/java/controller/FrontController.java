package controller;


import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion=request.getParameter("operation");
		String urlVista="";
		switch(operacion) {
			case "doTemas":
				request.getRequestDispatcher("TemasController").include(request, response);	
				urlVista="temas.jsp";
				break;			
			 
			case "doLibros":
				request.getRequestDispatcher("LibrosController").forward(request, response);			 
				return; //en peticiones AJAX la respuesta la lleva a cabo
				//el servlet controlador
 
			default:urlVista="inicio.html";break;
		};
		request.getRequestDispatcher(urlVista).forward(request, response);
	}
	


}

 
 

 

