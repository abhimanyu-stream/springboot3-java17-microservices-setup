package com.stream.authentication;

import com.stream.authentication.configuration.RoleRepositorySpringJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableDiscoveryClient
public class AuthenticationServiceApplication {

	@Autowired
	private RoleRepositorySpringJDBC roleRepositorySpringJDBC;

	public static void main(String[] args) {

		SpringApplication.run(AuthenticationServiceApplication.class, args);



	}
	@EventListener(ApplicationReadyEvent.class)
	public void onApplicationReady(ApplicationReadyEvent event) {
		//Your custom logic here
		//you might want to load additional data into your application, cache, schedule background tasks, or perform any other necessary setup.
		//When your application receives the ApplicationReadyEvent, it means that:
		//All beans have been created and initialized.
		//Auto-configuration has taken place.
		//Database connections (if any) are established.
		//Other essential setup steps have been completed.
		roleRepositorySpringJDBC.deleteAllRecords();
		roleRepositorySpringJDBC.insertIntoRoleAdmin();
		roleRepositorySpringJDBC.insertIntoRoleUser();
		roleRepositorySpringJDBC.insertIntoRoleModerator();
		System.out.println("Application is ready! Let's do something awesome.");
	}
	//ApplicationStartedEvent
	//ApplicationFailedEvent
}
