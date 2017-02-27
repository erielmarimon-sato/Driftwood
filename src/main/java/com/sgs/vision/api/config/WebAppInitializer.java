package com.sgs.vision.api.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.sgs.vision.storage.config.MongoConfig;
import com.thetransactioncompany.cors.CORSFilter;  


public class WebAppInitializer  implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();  
        ctx.register(MongoConfig.class,RestConfig.class,VisionSwaggerConfiguration.class);  
        ctx.setServletContext(servletContext);  
        
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("CORS",CORSFilter.class);
        filterRegistration.setInitParameter("encoding", "UTF-8");
        filterRegistration.setInitParameter("forceEncoding", "true");
        filterRegistration.setInitParameter("cors.supportedMethods", "GET, HEAD, POST, PUT, OPTIONS, DELETE");
        filterRegistration.addMappingForUrlPatterns(null, true, "/*");

        Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));  
        dynamic.addMapping("/");  
        dynamic.setLoadOnStartup(1);  	
        

	}
}