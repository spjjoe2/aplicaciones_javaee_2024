package servlets;

import java.io.IOException;

import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

 @WebServlet("/BuscadorServlet")
public class BuscadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tematica = request.getParameter("tematica");		 
		 
		BuscadorService buscadorService= new BuscadorService(); 
		List<Resultado> resBusqueda =buscadorService.resultadoBusqueda(tematica);
		request.setAttribute("tematica", resBusqueda);
		request.getRequestDispatcher("resBusqueda.jsp").forward(request, response);
	 		  
		 
	}

}
 

