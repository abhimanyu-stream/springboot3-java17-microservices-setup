package com.stream.product.catalogue.wishlist.repository;

import com.stream.product.catalogue.wishlist.model.FoodAndBeverageProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodAndBeverageProductRepository extends JpaRepository<FoodAndBeverageProduct, Long> {
}
