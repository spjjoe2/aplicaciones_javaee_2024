package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet("/Contador")
public class Contador extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// recuperamos atr de sesion q contine valor de contador
		// se incr. uy se vuelve a guardar. Despìes transferimos petic a 
		// pagina resultado.jsp
		
		int contador =1;	
		HttpSession s =request.getSession();
		if(s.getAttribute("contador")!=null) {
			contador =(Integer)s.getAttribute("contador");
			contador ++;	
		} 
		s.setAttribute("contador",contador);	 	 
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
		
	}	

}
