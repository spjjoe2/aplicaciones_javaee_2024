package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UsuariosService;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuariosService service=new UsuariosService();
		boolean result=service.autenticar(request.getParameter("usuario"), request.getParameter("password"));
		//el resultado de la autenticaciÃ³n lo guardamos en un atributo de peticiÃ³n
		//para que lo pueda utilizar el FC
		request.setAttribute("autenticado",result );
		//si el usuario estÃ¡ autenticado, lo guardamos en un atributo de sesiÃ³n
		if(result) {
			request.getSession().setAttribute("usuario", request.getParameter("usuario"));
		}
	}
