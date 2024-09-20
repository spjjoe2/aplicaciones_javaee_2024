package listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

@WebListener
public class EscuchadorEventos implements ServletContextListener, HttpSessionListener {

    

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        //inicializar atributo de sesiÃ³n contador
    	HttpSession sesion=se.getSession();    	
    	sesion.setAttribute("contador", 0);
    	ServletContext context =sesion.getServletContext();    	 
		int sesionesActivas=(Integer)context.getAttribute("sesionesActivas");		
		context.setAttribute("sesionesActivas",sesionesActivas++);     
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
      	ServletContext context =se.getSession().getServletContext();   	 
		int sesionesActivas=(Integer)context.getAttribute("sesionesActivas");		
		context.setAttribute("sesionesActivas",sesionesActivas--);
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext context=sce.getServletContext();
         context.setAttribute("global", 0);
         context.setAttribute("sesionesActivas",0);
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
 
    }
	
}

