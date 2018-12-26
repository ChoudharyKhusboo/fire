package com.practice.shoppingkart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
@EnableSwagger2
public class ShoppingkartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingkartApplication.class, args);
	}

	@Bean
	public Docket swaggerSettings() {
		return new Docket(DocumentationType.SWAGGER_2)
				.enable(true)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.practice.shoppingkart"))
				.paths(PathSelectors.any())
				.build();
	}
}
