package com.zebra.giga_dat_back_end;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@OpenAPIDefinition
@RequiredArgsConstructor
@SpringBootApplication
public class GigaDatBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(GigaDatBackEndApplication.class, args);
	}

}
