package com.stream.order.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class OrderPurchaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderPurchaseServiceApplication.class, args);
	}

}
