package com.product.rec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableCaching
@PropertySource(value = {"classpath:messages.properties"})
public class RecApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecApplication.class, args);
	}

}
