package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/TablaNumero")
public class TablaNumero extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Integer.parseInt(request.getParameter("numero"));
			request.getRequestDispatcher("multiplicar.jsp").forward(request, response);
		}catch(NumberFormatException ex) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}

}


 


