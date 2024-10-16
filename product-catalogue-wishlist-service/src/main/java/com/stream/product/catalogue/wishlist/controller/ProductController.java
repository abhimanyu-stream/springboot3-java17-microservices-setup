package com.stream.product.catalogue.wishlist.controller;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.Product;
import com.stream.product.catalogue.wishlist.service.ProductService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {


    // All api is for Admin Panel, not for Customer Access
    private ProductService productService;

    public Product createProduct(@RequestBody ProductRequest productRequest){


        return productService.createProduct(productRequest);
    }
}
