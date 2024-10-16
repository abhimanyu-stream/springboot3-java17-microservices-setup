package com.stream.product.catalogue.wishlist;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.enums.*;
import com.stream.product.catalogue.wishlist.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductCatalogueWishlistServiceApplication {
	// Product Catalogue WishList application
	public static void main(String[] args) {
		SpringApplication.run(ProductCatalogueWishlistServiceApplication.class, args);

		//(@RequestBody ProductRequest productRequest)
		ProductRequest productRequest = new ProductRequest("DELL", ProductCategory.ELECTRONICS, ProductSubCategory.LAPTOPS,
				AgeGroup.ADULT, Gender.NONE, Color.BLACK, Size.L,
				"Inspiron","https://192.0.0.10:8080/dell/inspiron/aio/windows/allinone/5400.jpge",BigDecimal.valueOf(300000.00),
				50.0,Arrival.BRANDNEWLAUNCH.toString(),"DELL","Padma","India",
				"2021",
				"some details","some description");

	}
}
