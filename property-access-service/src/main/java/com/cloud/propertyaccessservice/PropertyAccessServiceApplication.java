package com.cloud.propertyaccessservice;

import com.cloud.model.PropertyAccessBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(PropertyAccessBean.class)
@RefreshScope
public class PropertyAccessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertyAccessServiceApplication.class, args);
	}

}
