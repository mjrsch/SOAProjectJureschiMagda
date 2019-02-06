package com.project.soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class SoaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaAppApplication.class, args);
	}

}

