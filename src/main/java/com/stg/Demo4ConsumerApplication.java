package com.stg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.SwaggerDefinition;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@SwaggerDefinition
public class Demo4ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Demo4ConsumerApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplet() {
		return new RestTemplate();
	}

}
