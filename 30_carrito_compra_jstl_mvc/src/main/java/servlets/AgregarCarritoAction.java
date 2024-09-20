package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;
 
 

@WebServlet("/AgregarCarritoAction")
public class AgregarCarritoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		HttpSession s =request.getSession(); 
		List<Producto> carritoCompra= new ArrayList<Producto>();		
		if(s.getAttribute("carrito")!=null) {			 
			carritoCompra =(List<Producto>)s.getAttribute("carrito");
		};	  	 
		carritoCompra.add(new Producto(request.getParameter("nombre"),
					Double.parseDouble(request.getParameter("precio")),
					request.getParameter("categoria")));		 
			
 	
	}

}
