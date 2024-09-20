package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.AutenticacionService;


 
public class ComprobarCookieUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher;
		Cookie[] cookies =request.getCookies();
		Boolean encontrada= false;
		String usuario=null;
		  if(cookies!=null) {
			for(Cookie ck: cookies) {
				if(ck.getName().equals("usuario")) {
					 usuario =ck.getValue();
					encontrada =true;
					break;
				}
			}
		}
		if(encontrada== true) {	 		 
			//recoge la ficha del usuario antes de pasar el control a bienvenida.jsp
			AutenticacionService service=new AutenticacionService();
			request.setAttribute(""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ ""
					+ "",service.fichaUsuario(usuario));

			 request.getRequestDispatcher("bienvenida.jsp").forward(request, response); 
		}else {
			 request.getRequestDispatcher("login.html").forward(request, response); 
		} 
 
		 
	}

}
