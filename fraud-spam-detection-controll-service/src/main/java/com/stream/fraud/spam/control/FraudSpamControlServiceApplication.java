package com.stream.fraud.spam.control;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@OpenAPIDefinition(info = @Info(title ="fraudspamcontrollservice API", version = "1.0", description = "fraudspamcontroll Service"))
@EnableDiscoveryClient
@SpringBootApplication
public class FraudSpamControlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudSpamControlServiceApplication.class, args);
	}

}
