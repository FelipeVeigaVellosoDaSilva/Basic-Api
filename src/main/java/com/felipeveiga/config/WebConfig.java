package com.felipeveiga.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class WebConfig{

	//Liberando Cors
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE",
				"OPTIONS", "HEAD", "TRACE", "CONNECT");
	}
	
}
