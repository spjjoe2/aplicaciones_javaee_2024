package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Error")
public class Error extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		response.setContentType("text/html");		 
		try(PrintWriter out=response.getWriter()){
			out.println("<html><head></head><body><center>");
			out.println("<h2>El usuario "+user+"</h2>");
			out.println("<h2>con contraseña "+pwd+"</h2>");
			out.println("<h2>No es correcto</h2>");
			out.println("</center></body></html>");
			out.println("<a href='login.html'>Volver</a></body></html>");
		} 
	}

}
