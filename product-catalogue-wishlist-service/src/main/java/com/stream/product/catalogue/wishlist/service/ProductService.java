package com.stream.product.catalogue.wishlist.service;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;

import com.stream.product.catalogue.wishlist.factory.ElectronicsFactory;
import com.stream.product.catalogue.wishlist.factory.Product;
import com.stream.product.catalogue.wishlist.factory.ElectronicsProductFactory;
import com.stream.product.catalogue.wishlist.model.ElectronicsProduct;
import com.stream.product.catalogue.wishlist.repository.ElectronicsProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {

    private final ElectronicsFactory electronicsFactory;
    @Autowired
    private ElectronicsProductRepository electronicsProductRepository;
    private final ElectronicsProductFactory fashionFactory;
    private final ElectronicsProductFactory booksMoviesMusicGamesFactory;
    private final ElectronicsProductFactory beautyAndPersonalCareFactory;
    private final ElectronicsProductFactory foodAndBeverageFactory;
    private final ElectronicsProductFactory groceryFactory;
    private final ElectronicsProductFactory homeDecorationFactory;

    @Autowired
    public ProductService(ElectronicsFactory electronicsFactory, ElectronicsProductFactory fashionFactory, ElectronicsProductFactory booksMoviesMusicGamesFactory, ElectronicsProductFactory beautyAndPersonalCareFactory, ElectronicsProductFactory foodAndBeverageFactory, ElectronicsProductFactory groceryFactory, ElectronicsProductFactory homeDecorationFactory) {
        this.electronicsFactory = electronicsFactory;
        this.fashionFactory = fashionFactory;
        this.booksMoviesMusicGamesFactory = booksMoviesMusicGamesFactory;
        this.beautyAndPersonalCareFactory = beautyAndPersonalCareFactory;
        this.foodAndBeverageFactory = foodAndBeverageFactory;
        this.groceryFactory = groceryFactory;
        this.homeDecorationFactory = homeDecorationFactory;

    }

    public ElectronicsProduct createElectronicsProduct(ProductRequest productRequest) {
        ElectronicsProduct electronicsProduct = electronicsFactory.createElectronicsProduct(productRequest);//ElectronicsProduct

        electronicsProduct = electronicsProductRepository.save(electronicsProduct);
        System.out.println(electronicsProduct);

        return electronicsProduct;
    }

    /*public Product createFashionProduct(ProductRequest productRequest) {
        Product fashionProduct = fashionFactory.createProduct();//FashionProduct
        switch (productRequest.getProductSubCategory()){
            case CLOTHING -> {
                fashionProduct.setProductCategory(productRequest.getProductCategory());
                fashionProduct.setProductSubCategory(productRequest.getProductSubCategory());
                fashionProduct.setAgeGroup(productRequest.getAgeGroup());
                fashionProduct.setGender(productRequest.getGender());
                fashionProduct.setColor(productRequest.getColor());
                fashionProduct.setSize(productRequest.getSize());
                fashionProduct.setBrandName(productRequest.getBrandName());//Apple
                fashionProduct.setProductName(productRequest.getProductName());//ios-82
                fashionProduct.setProductId(UUID.randomUUID());//convert it into String if required
                fashionProduct.setSkuCode("someskocode");//create a util class
                fashionProduct.setPrice(productRequest.getPrice());
                fashionProduct.setArrival(productRequest.getArrival());
                fashionProduct.setDiscount(productRequest.getDiscount());
                fashionProduct.setDescription(productRequest.getDescription());
                fashionProduct.setFeatureDetails(productRequest.getFeatureDetails());
                fashionProduct.setImageUrl(productRequest.getImageUrl());
                fashionProduct.setManufacturedCompany(productRequest.getManufacturedCompany());
                fashionProduct.setManufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry());
                fashionProduct.setManufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation());
                fashionProduct.setManufacturedDate(productRequest.getManufacturedDate());

                // store in DB
                break;
            }
            case FOOTWEAR -> {

                // store in DB
                break;
            }
        }
        return fashionProduct;
    }

    public Product createBooksMoviesMusicGamesProduct(ProductRequest productRequest) {
        Product booksMoviesMusicGamesProduct = electronicsFactory.createProduct();//BooksMoviesMusicGamesProduct
        switch (productRequest.getProductSubCategory()){
            case LITERATURE -> {
                booksMoviesMusicGamesProduct.setProductCategory(productRequest.getProductCategory());
                booksMoviesMusicGamesProduct.setProductSubCategory(productRequest.getProductSubCategory());
                booksMoviesMusicGamesProduct.setAgeGroup(productRequest.getAgeGroup());
                booksMoviesMusicGamesProduct.setGender(productRequest.getGender());
                booksMoviesMusicGamesProduct.setColor(productRequest.getColor());
                booksMoviesMusicGamesProduct.setSize(productRequest.getSize());
                booksMoviesMusicGamesProduct.setBrandName(productRequest.getBrandName());//Apple
                booksMoviesMusicGamesProduct.setProductName(productRequest.getProductName());//ios-82
                booksMoviesMusicGamesProduct.setProductId(UUID.randomUUID());//convert it into String if required
                booksMoviesMusicGamesProduct.setSkuCode("someskocode");//create a util class
                booksMoviesMusicGamesProduct.setPrice(productRequest.getPrice());
                booksMoviesMusicGamesProduct.setArrival(productRequest.getArrival());
                booksMoviesMusicGamesProduct.setDiscount(productRequest.getDiscount());
                booksMoviesMusicGamesProduct.setDescription(productRequest.getDescription());
                booksMoviesMusicGamesProduct.setFeatureDetails(productRequest.getFeatureDetails());
                booksMoviesMusicGamesProduct.setImageUrl(productRequest.getImageUrl());
                booksMoviesMusicGamesProduct.setManufacturedCompany(productRequest.getManufacturedCompany());
                booksMoviesMusicGamesProduct.setManufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry());
                booksMoviesMusicGamesProduct.setManufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation());
                booksMoviesMusicGamesProduct.setManufacturedDate(productRequest.getManufacturedDate());

                // store in DB
                break;
            }

        }
        return booksMoviesMusicGamesProduct;
    }

    public Product createBeautyAndPersonalCareProduct(ProductRequest productRequest) {
        Product beautyAndPersonalCareProduct = electronicsFactory.createProduct();//BeautyAndPersonalCareProduct
        switch (productRequest.getProductSubCategory()){
            case CREAM -> {
                beautyAndPersonalCareProduct.setProductCategory(productRequest.getProductCategory());
                beautyAndPersonalCareProduct.setProductSubCategory(productRequest.getProductSubCategory());
                beautyAndPersonalCareProduct.setAgeGroup(productRequest.getAgeGroup());
                beautyAndPersonalCareProduct.setGender(productRequest.getGender());
                beautyAndPersonalCareProduct.setColor(productRequest.getColor());
                beautyAndPersonalCareProduct.setSize(productRequest.getSize());
                beautyAndPersonalCareProduct.setBrandName(productRequest.getBrandName());//Apple
                beautyAndPersonalCareProduct.setProductName(productRequest.getProductName());//ios-82
                beautyAndPersonalCareProduct.setProductId(UUID.randomUUID());//convert it into String if required
                beautyAndPersonalCareProduct.setSkuCode("someskocode");//create a util class
                beautyAndPersonalCareProduct.setPrice(productRequest.getPrice());
                beautyAndPersonalCareProduct.setArrival(productRequest.getArrival());
                beautyAndPersonalCareProduct.setDiscount(productRequest.getDiscount());
                beautyAndPersonalCareProduct.setDescription(productRequest.getDescription());
                beautyAndPersonalCareProduct.setFeatureDetails(productRequest.getFeatureDetails());
                beautyAndPersonalCareProduct.setImageUrl(productRequest.getImageUrl());
                beautyAndPersonalCareProduct.setManufacturedCompany(productRequest.getManufacturedCompany());
                beautyAndPersonalCareProduct.setManufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry());
                beautyAndPersonalCareProduct.setManufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation());
                beautyAndPersonalCareProduct.setManufacturedDate(productRequest.getManufacturedDate());

                // store in DB
                break;
            }

        }
        return beautyAndPersonalCareProduct;
    }

    public Product createFoodAndBeverageProduct(ProductRequest productRequest) {
        Product foodAndBeverageProduct = electronicsFactory.createProduct();//FoodAndBeverageProduct
        switch (productRequest.getProductSubCategory()){
            case RICE -> {
                foodAndBeverageProduct.setProductCategory(productRequest.getProductCategory());
                foodAndBeverageProduct.setProductSubCategory(productRequest.getProductSubCategory());
                foodAndBeverageProduct.setAgeGroup(productRequest.getAgeGroup());
                foodAndBeverageProduct.setGender(productRequest.getGender());
                foodAndBeverageProduct.setColor(productRequest.getColor());
                foodAndBeverageProduct.setSize(productRequest.getSize());
                foodAndBeverageProduct.setBrandName(productRequest.getBrandName());//Apple
                foodAndBeverageProduct.setProductName(productRequest.getProductName());//ios-82
                foodAndBeverageProduct.setProductId(UUID.randomUUID());//convert it into String if required
                foodAndBeverageProduct.setSkuCode("someskocode");//create a util class
                foodAndBeverageProduct.setPrice(productRequest.getPrice());
                foodAndBeverageProduct.setArrival(productRequest.getArrival());
                foodAndBeverageProduct.setDiscount(productRequest.getDiscount());
                foodAndBeverageProduct.setDescription(productRequest.getDescription());
                foodAndBeverageProduct.setFeatureDetails(productRequest.getFeatureDetails());
                foodAndBeverageProduct.setImageUrl(productRequest.getImageUrl());
                foodAndBeverageProduct.setManufacturedCompany(productRequest.getManufacturedCompany());
                foodAndBeverageProduct.setManufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry());
                foodAndBeverageProduct.setManufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation());
                foodAndBeverageProduct.setManufacturedDate(productRequest.getManufacturedDate());

                // store in DB
                break;
            }

        }
        return foodAndBeverageProduct;
    }

    public Product createGroceryProduct(ProductRequest productRequest) {
        Product groceryProduct = electronicsFactory.createProduct();//GroceryProduct
        switch (productRequest.getProductSubCategory()){
            case UTENSIL -> {
                groceryProduct.setProductCategory(productRequest.getProductCategory());
                groceryProduct.setProductSubCategory(productRequest.getProductSubCategory());
                groceryProduct.setAgeGroup(productRequest.getAgeGroup());
                groceryProduct.setGender(productRequest.getGender());
                groceryProduct.setColor(productRequest.getColor());
                groceryProduct.setSize(productRequest.getSize());
                groceryProduct.setBrandName(productRequest.getBrandName());//Apple
                groceryProduct.setProductName(productRequest.getProductName());//ios-82
                groceryProduct.setProductId(UUID.randomUUID());//convert it into String if required
                groceryProduct.setSkuCode("someskocode");//create a util class
                groceryProduct.setPrice(productRequest.getPrice());
                groceryProduct.setArrival(productRequest.getArrival());
                groceryProduct.setDiscount(productRequest.getDiscount());
                groceryProduct.setDescription(productRequest.getDescription());
                groceryProduct.setFeatureDetails(productRequest.getFeatureDetails());
                groceryProduct.setImageUrl(productRequest.getImageUrl());
                groceryProduct.setManufacturedCompany(productRequest.getManufacturedCompany());
                groceryProduct.setManufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry());
                groceryProduct.setManufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation());
                groceryProduct.setManufacturedDate(productRequest.getManufacturedDate());

                // store in DB
                break;
            }

        }
        return groceryProduct;
    }

    public Product createHomeDecorationProduct(ProductRequest productRequest) {
        Product homeDecorationProduct = electronicsFactory.createProduct();//HomeDecorationProduct
        switch (productRequest.getProductSubCategory()){
            case DININGTABLE -> {
                homeDecorationProduct.setProductCategory(productRequest.getProductCategory());
                homeDecorationProduct.setProductSubCategory(productRequest.getProductSubCategory());
                homeDecorationProduct.setAgeGroup(productRequest.getAgeGroup());
                homeDecorationProduct.setGender(productRequest.getGender());
                homeDecorationProduct.setColor(productRequest.getColor());
                homeDecorationProduct.setSize(productRequest.getSize());
                homeDecorationProduct.setBrandName(productRequest.getBrandName());//Apple
                homeDecorationProduct.setProductName(productRequest.getProductName());//ios-82
                homeDecorationProduct.setProductId(UUID.randomUUID());//convert it into String if required
                homeDecorationProduct.setSkuCode("someskocode");//create a util class
                homeDecorationProduct.setPrice(productRequest.getPrice());
                homeDecorationProduct.setArrival(productRequest.getArrival());
                homeDecorationProduct.setDiscount(productRequest.getDiscount());
                homeDecorationProduct.setDescription(productRequest.getDescription());
                homeDecorationProduct.setFeatureDetails(productRequest.getFeatureDetails());
                homeDecorationProduct.setImageUrl(productRequest.getImageUrl());
                homeDecorationProduct.setManufacturedCompany(productRequest.getManufacturedCompany());
                homeDecorationProduct.setManufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry());
                homeDecorationProduct.setManufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation());
                homeDecorationProduct.setManufacturedDate(productRequest.getManufacturedDate());

                // store in DB
                break;
            }
            case BEDSHEET -> {

                break;
            }
        }
        return homeDecorationProduct;
    }*/
}
