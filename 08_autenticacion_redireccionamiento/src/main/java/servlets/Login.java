package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 @WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String pwd = request.getParameter("password");
		 
		if(user.equals("admin")&&pwd.equals("pass")) {
			response.sendRedirect("https://www.google.com?user=user"+user);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error");
			dispatcher = request.getRequestDispatcher("Error");
		}
	 
		 
			
		
	}

}
