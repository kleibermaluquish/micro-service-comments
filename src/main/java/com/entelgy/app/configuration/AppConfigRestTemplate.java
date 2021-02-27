package com.entelgy.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfigRestTemplate {
	
	@Bean("clienteRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
