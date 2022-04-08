package com.raquel.biblioteca;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {
	
	@Bean("clienteRest")
	@LoadBalanced
	public RestTemplate conectarRestTemplate() {
		return new RestTemplate();
	}
}
