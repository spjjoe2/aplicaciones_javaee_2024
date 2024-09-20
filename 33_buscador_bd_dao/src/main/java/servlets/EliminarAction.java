package servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BuscadorService;

@WebServlet("/EliminarAction")
public class EliminarAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BuscadorService buscadorService=new BuscadorService();
		buscadorService.eliminarResultado(Integer.parseInt(request.getParameter("idResultado")));
		 
	}
	
 


}

