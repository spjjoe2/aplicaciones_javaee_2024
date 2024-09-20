package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dtos.ClienteDto;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ClienteService;

@WebServlet("/AltaClienteController")
public class AltaClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	ClienteService clienteService;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDto clienteDto = new ClienteDto(request.getParameter("usuario"),
				request.getParameter("password"),
				request.getParameter("email"),
				Integer.parseInt(request.getParameter("telefono")));
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		out.print(clienteService.guardarCliente(clienteDto));  
	}

}
