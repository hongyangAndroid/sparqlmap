package org.aksw.sparqlmap.web.spring;

import java.util.List;

import org.aksw.sparqlmap.core.spring.ContextSetup;
import org.aksw.sparqlmap.web.SparqlMapContextManager;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "org.aksw.sparqlmap.web", "org.aksw.sparqlmap.spring" })
public class WebAppConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	org.springframework.core.env.Environment env;
	

	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
	    registry.addResourceHandler("/snorql/**").addResourceLocations("/snorql/");

	    registry.addResourceHandler("/*.html").addResourceLocations("/");
	    registry.addResourceHandler("/*.jsp").addResourceLocations("/");
	    registry.setOrder(0);
	}
	  


	

}
