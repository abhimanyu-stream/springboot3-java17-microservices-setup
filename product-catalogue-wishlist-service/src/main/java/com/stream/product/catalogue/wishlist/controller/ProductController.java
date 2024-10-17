package com.stream.product.catalogue.wishlist.controller;


import com.stream.product.catalogue.wishlist.dto.ProductRequest;

import com.stream.product.catalogue.wishlist.dto.ProductResponse;
import com.stream.product.catalogue.wishlist.factory.Product;
import com.stream.product.catalogue.wishlist.model.ElectronicsProduct;
import com.stream.product.catalogue.wishlist.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {


    // All api is for Admin Panel, not for Customer Access
    private ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/electronics")
    public ResponseEntity<?> createElectronicsProduct(@RequestBody ProductRequest productRequest){

        Product electronicsProduct = productService.createElectronicsProduct(productRequest);

        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(electronicsProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        //ElectronicsProduct electronicsProduct = productService.createElectronicsProduct(productRequest);

        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);
    }
    @PostMapping("/fashion")
    public ResponseEntity<?> createFashionProduct(@RequestBody ProductRequest productRequest){

        Product fashionProduct = productService.createFashionProduct(productRequest);
        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(fashionProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);
    }
    @PostMapping("/booksmoviesmusicgames")
    public ResponseEntity<?> createBooksMoviesMusicGamesProduct(@RequestBody ProductRequest productRequest){
        Product booksMoviesMusicGamesProduct = productService.createBooksMoviesMusicGamesProduct(productRequest);

        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(booksMoviesMusicGamesProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);
    }
    @PostMapping("/beautyandpersonalcare")
    public ResponseEntity<?> createBeautyAndPersonalCareProduct(@RequestBody ProductRequest productRequest){

        Product beautyAndPersonalCareProduct =  productService.createBeautyAndPersonalCareProduct(productRequest);

        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(beautyAndPersonalCareProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);

    }
    @PostMapping("/foodandbeverage")
    public ResponseEntity<?> createFoodAndBeverageProduct(@RequestBody ProductRequest productRequest){

        Product foodAndBeverageProduct = productService.createFoodAndBeverageProduct(productRequest);

        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(foodAndBeverageProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);
    }
    @PostMapping("/grocery")
    public ResponseEntity<?> createGroceryProduct(@RequestBody ProductRequest productRequest){

        Product groceryProduct = productService.createGroceryProduct(productRequest);

        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(groceryProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);
    }
    @PostMapping("/homedecoration")
    public ResponseEntity<?> createHomeDecorationProduct(@RequestBody ProductRequest productRequest){

        Product homeDecorationProduct = productService.createHomeDecorationProduct(productRequest);

        ProductResponse productResponse = new ProductResponse();
        BeanUtils.copyProperties(homeDecorationProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        return new ResponseEntity<>(productResponse,headers,HttpStatus.CREATED);
    }
}
