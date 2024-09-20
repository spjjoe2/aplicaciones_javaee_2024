

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/ContadorServlet")
public class ContadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		 
		if(request.getParameter("pulgar").equals("arriba")){
	    	int pulgarArriba=1;
	    	ServletContext context=request.getServletContext(); 
			if(context.getAttribute("pulgarArriba")!=null) {
				pulgarArriba=(Integer)context.getAttribute("pulgarArriba");
				pulgarArriba++;
			}
			context.setAttribute("pulgarArriba", pulgarArriba);
	    	
	    }
	    if(request.getParameter("pulgar").equals("abajo")){
	    	int pulgarAbajo=1;
	    	ServletContext context=request.getServletContext(); 
			if(context.getAttribute("pulgarAbajo")!=null) {
				pulgarAbajo=(Integer)context.getAttribute("pulgarAbajo");
				pulgarAbajo++;
			}
			context.setAttribute("pulgarAbajo", pulgarAbajo);
	    	
	    }
	    request.getRequestDispatcher("like.jsp").forward(request, response);
		
 
		
		
		
		
		
		
		
		
		
		
	}

}
