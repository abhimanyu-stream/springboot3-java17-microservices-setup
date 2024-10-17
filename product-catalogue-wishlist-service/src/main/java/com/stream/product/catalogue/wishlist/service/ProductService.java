package com.stream.product.catalogue.wishlist.service;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;

import com.stream.product.catalogue.wishlist.factory.*;
import com.stream.product.catalogue.wishlist.model.*;
import com.stream.product.catalogue.wishlist.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductService {

    private final ElectronicsFactory electronicsFactory;
    private final FashionProductFactory fashionProductFactory;

    private final BooksMoviesMusicGamesFactory booksMoviesMusicGamesFactory;
    private final FoodAndBeverageFactory foodAndBeverageFactory;
    private final GroceryFactory groceryFactory;
    private final HomeDecorationFactory homeDecorationFactory;
    private final BeautyAndPersonalCareFactory beautyAndPersonalCareFactory;

    private ElectronicsProductRepository electronicsProductRepository;
    private BeautyAndPersonalCareProductRepository beautyAndPersonalCareProductRepository;
    private BooksMoviesMusicGamesProductRepository booksMoviesMusicGamesProductRepository;
    private HomeDecorationProductRepository homeDecorationProductRepository;
    private GroceryProductRepository groceryProductRepository;
    private FoodAndBeverageProductRepository foodAndBeverageProductRepository;
    private FashionProductRepository fashionProductRepository;
    @Autowired
    public ProductService(ElectronicsFactory electronicsFactory, FashionProductFactory fashionProductFactory, BooksMoviesMusicGamesFactory booksMoviesMusicGamesFactory, FoodAndBeverageFactory foodAndBeverageFactory, GroceryFactory groceryFactory, HomeDecorationFactory homeDecorationFactory, BeautyAndPersonalCareFactory beautyAndPersonalCareFactory, ElectronicsProductRepository electronicsProductRepository, BeautyAndPersonalCareProductRepository beautyAndPersonalCareProductRepository, BooksMoviesMusicGamesProductRepository booksMoviesMusicGamesProductRepository, HomeDecorationProductRepository homeDecorationProductRepository, GroceryProductRepository groceryProductRepository, FoodAndBeverageProductRepository foodAndBeverageProductRepository, FashionProductRepository fashionProductRepository) {
        this.electronicsFactory = electronicsFactory;
        this.fashionProductFactory = fashionProductFactory;
        this.booksMoviesMusicGamesFactory = booksMoviesMusicGamesFactory;
        this.foodAndBeverageFactory = foodAndBeverageFactory;
        this.groceryFactory = groceryFactory;
        this.homeDecorationFactory = homeDecorationFactory;
        this.beautyAndPersonalCareFactory = beautyAndPersonalCareFactory;
        this.electronicsProductRepository = electronicsProductRepository;
        this.beautyAndPersonalCareProductRepository = beautyAndPersonalCareProductRepository;
        this.booksMoviesMusicGamesProductRepository = booksMoviesMusicGamesProductRepository;
        this.homeDecorationProductRepository = homeDecorationProductRepository;
        this.groceryProductRepository = groceryProductRepository;
        this.foodAndBeverageProductRepository = foodAndBeverageProductRepository;
        this.fashionProductRepository = fashionProductRepository;
    }

    public ElectronicsProduct createElectronicsProduct(ProductRequest productRequest) {
        ElectronicsProduct electronicsProduct = electronicsFactory.createElectronicsProduct(productRequest);//ElectronicsProduct

        electronicsProduct = electronicsProductRepository.save(electronicsProduct);
        System.out.println(electronicsProduct);

        return electronicsProduct;
    }

    public Product createFashionProduct(ProductRequest productRequest) {
        FashionProduct fashionProduct = fashionProductFactory.createFashionProduct(productRequest);//FashionProduct
        fashionProductRepository.save(fashionProduct);
        return fashionProduct;
    }

    public Product createBooksMoviesMusicGamesProduct(ProductRequest productRequest) {
        BooksMoviesMusicGamesProduct booksMoviesMusicGamesProduct = booksMoviesMusicGamesFactory.createBooksMoviesMusicGamesProduct(productRequest);//BooksMoviesMusicGamesProduct

        booksMoviesMusicGamesProductRepository.save(booksMoviesMusicGamesProduct);

        return booksMoviesMusicGamesProduct;
    }

    public Product createBeautyAndPersonalCareProduct(ProductRequest productRequest) {
        BeautyAndPersonalCareProduct beautyAndPersonalCareProduct = beautyAndPersonalCareFactory.createBeautyAndPersonalCareProduct(productRequest);//BeautyAndPersonalCareProduct
        beautyAndPersonalCareProductRepository.save(beautyAndPersonalCareProduct);
        return beautyAndPersonalCareProduct;
    }

    public Product createFoodAndBeverageProduct(ProductRequest productRequest) {
        FoodAndBeverageProduct foodAndBeverageProduct = foodAndBeverageFactory.createFoodAndBeverageProduct(productRequest);//FoodAndBeverageProduct

        foodAndBeverageProductRepository.save(foodAndBeverageProduct);

        return foodAndBeverageProduct;
    }

    public Product createGroceryProduct(ProductRequest productRequest) {
        GroceryProduct groceryProduct = groceryFactory.createGroceryProduct(productRequest);//GroceryProduct
        groceryProductRepository.save(groceryProduct);
        return groceryProduct;
    }

    public Product createHomeDecorationProduct(ProductRequest productRequest) {
        HomeDecorationProduct homeDecorationProduct = homeDecorationFactory.createHomeDecorationProduct(productRequest);//HomeDecorationProduct
        homeDecorationProductRepository.save(homeDecorationProduct);
        return homeDecorationProduct;
    }
}
