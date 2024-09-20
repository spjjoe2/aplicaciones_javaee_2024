package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import dtos.LibroDto;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ClienteService;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	ClienteService clienteService;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usr= request.getParameter("login");
		String pwd = request.getParameter("password");
		boolean res =clienteService.login(usr,pwd);
		if(res) {  
			 request.getSession().setAttribute("usuario",usr);
		};
			 request.setAttribute("autenticado", res);
  
	}

}
