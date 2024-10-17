package com.stream.product.catalogue.wishlist.repository;

import com.stream.product.catalogue.wishlist.model.FashionProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FashionProductRepository extends JpaRepository<FashionProduct, Long> {
}
