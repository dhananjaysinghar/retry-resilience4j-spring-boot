package com.cb;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "user-service", version = "v1"))
public class CircuitBreakerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerSpringBootApplication.class, args);
	}

}
