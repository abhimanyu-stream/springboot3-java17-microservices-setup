package com.stream.product.catalogue.wishlist.repository;


import com.stream.product.catalogue.wishlist.model.ElectronicsProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsProductRepository extends JpaRepository<ElectronicsProduct, Long> {
}
