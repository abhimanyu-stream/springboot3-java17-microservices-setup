package com.stream.product.catalogue.wishlist.repository;

import com.stream.product.catalogue.wishlist.model.GroceryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface GroceryProductRepository extends JpaRepository<GroceryProduct, Long> {
}
