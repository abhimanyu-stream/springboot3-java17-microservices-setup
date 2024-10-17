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

        //Product electronicsProduct = productService.createElectronicsProduct(productRequest);
        //ProductResponse productResponse = new ProductResponse();

        //BeanUtils.copyProperties(electronicsProduct, productResponse);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "My custom header value");
        headers.set("Content-Type", "application/json");
        ElectronicsProduct electronicsProduct = productService.createElectronicsProduct(productRequest);
        return new ResponseEntity<>(electronicsProduct,headers,HttpStatus.CREATED);
    }
    /*@PostMapping("/fashion")
    public Product createFashionProduct(@RequestBody ProductRequest productRequest){

        return productService.createFashionProduct(productRequest);
    }
    @PostMapping("/booksmoviesmusicgames")
    public Product createBooksMoviesMusicGamesProduct(@RequestBody ProductRequest productRequest){


        return productService.createBooksMoviesMusicGamesProduct(productRequest);
    }
    @PostMapping("/beautyandpersonalcare")
    public Product createBeautyAndPersonalCareProduct(@RequestBody ProductRequest productRequest){

        return productService.createBeautyAndPersonalCareProduct(productRequest);
    }
    @PostMapping("/foodandbeverage")
    public Product createFoodAndBeverageProduct(@RequestBody ProductRequest productRequest){

        return productService.createFoodAndBeverageProduct(productRequest);
    }
    @PostMapping("/grocery")
    public Product createGroceryProduct(@RequestBody ProductRequest productRequest){

        return productService.createGroceryProduct(productRequest);
    }
    @PostMapping("/homedecoration")
    public Product createHomeDecorationProduct(@RequestBody ProductRequest productRequest){

        return productService.createHomeDecorationProduct(productRequest);
    }
*/

}
