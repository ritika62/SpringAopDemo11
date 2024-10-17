package com.ritika.springboot.SpringAopDemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Slf4j
@OpenAPIDefinition
@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAopDemoApplication.class, args);
	}

}
