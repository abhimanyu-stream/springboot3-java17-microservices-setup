package com.stream.product.catalogue.wishlist.repository;

import com.stream.product.catalogue.wishlist.model.BooksMoviesMusicGamesProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksMoviesMusicGamesProductRepository extends JpaRepository<BooksMoviesMusicGamesProduct, Long> {
}
