package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlVista="";
		String operation=request.getParameter("operation");
		urlVista=switch(operation) {
			case "doAlta"->{
				request.getRequestDispatcher("AltaAction").include(request, response);
				yield "menu.html";
			}
			case "doEliminar"->{
				request.getRequestDispatcher("EliminarAction").include(request, response);
				yield "menu.html";
			}
			case "doBuscar"->{
				request.getRequestDispatcher("BuscarAction").include(request, response);
				yield "resBusqueda.jsp";
			}
			case "doBuscarPorTematica"->{
				request.getRequestDispatcher("BuscarPorTematicaAction").include(request, response);
				yield "resBusquedaPorTematica.jsp";
			}			
			case "toAlta"->"altaResultado.html";
			case "toBuscar"->"buscarResultado.html";
			case "toEliminar"->"eliminarResultado.html";
			case "toBuscarPorTematica"->"buscarPorTematica.html";
			default ->"menu.html";
		};
		//transferimos el control a la vista definitiva
		request.getRequestDispatcher(urlVista).forward(request, response);
	}

}

