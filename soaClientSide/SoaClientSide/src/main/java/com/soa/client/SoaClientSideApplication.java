package com.soa.client;

import java.util.HashMap;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
@SpringBootApplication
public class SoaClientSideApplication extends SpringBootServletInitializer  {
	public static void main(String[] args) {
		HashMap<String, Object> props = new HashMap<String, Object>();
		props.put("server.port", 1000);
    	new SpringApplicationBuilder().sources(SoaClientSideApplication.class).properties(props).run(args);
	}

}

