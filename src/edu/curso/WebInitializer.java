package edu.curso;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
			AnnotationConfigWebApplicationContext
		springCtx = new AnnotationConfigWebApplicationContext(); 
			springCtx.register(Config.class); 
			springCtx.setServletContext(ctx); 
		Dynamic servlet = ctx
		.addServlet("dispatcher", new DispatcherServlet(springCtx)); 
		servlet.addMapping("/"); 
		servlet.setLoadOnStartup(1);
		
	}
}
