package com.ecommerce.customerservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
/**
INSERT INTO role VALUES(1,'ROLE_ADMIN');
INSERT INTO role VALUES(2,'ROLE_USER');
INSERT INTO role VALUES(3,'ROLE_MODERATOR');

write sql file and create a bit file and executes at application startuptime
drop db first then create
create static block to insert these values in role table at application startuptime onetimeonly
*/
}
