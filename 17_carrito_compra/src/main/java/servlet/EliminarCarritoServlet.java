package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 
public class EliminarCarritoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		HttpSession s =request.getSession(); 
		List<Producto> carritoCompra = (List<Producto>)s.getAttribute("carrito");
 		carritoCompra.removeIf(p->p.getNombre().equals(request.getParameter("nombre")));
		// no hay que hacer setAttribute pq tg la ref de la lista q está en sesion y borro el producto
 		// en ella dtamente
	 
		request.getRequestDispatcher("listaCarrito.jsp").forward(request, response);
		
		
	}

}
