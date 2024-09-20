package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.AutenticacionService;

 @WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		RequestDispatcher dispatcher;
		var service= new AutenticacionService();
		if(service.autenticar(user,pwd)){			 
			//creamos la ficha de usuario y la guardamos en un atributo
			// de peticion para que la pueda recuperar
			Ficha ficha =service.fichaUsuario(user);
			request.setAttribute("ficha", ficha);
			dispatcher = request.getRequestDispatcher("bienvenida.jsp");
		}else {
			dispatcher = request.getRequestDispatcher("error.jsp");
		} 
		dispatcher.forward(request, response);		
	}

}
