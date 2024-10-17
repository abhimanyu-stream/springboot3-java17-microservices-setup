package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.model.BooksMoviesMusicGamesProduct;

public class BooksMoviesMusicGamesFactory implements BooksMoviesMusicGamesProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories
    @Override
    public BooksMoviesMusicGamesProduct createBooksMoviesMusicGamesProduct() {
        return new BooksMoviesMusicGamesProduct();
    }
}
