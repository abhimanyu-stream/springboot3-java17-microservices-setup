package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.BooksMoviesMusicGamesProduct;

public interface BooksMoviesMusicGamesProductFactory {
    public abstract BooksMoviesMusicGamesProduct createBooksMoviesMusicGamesProduct(ProductRequest productRequest);
}
