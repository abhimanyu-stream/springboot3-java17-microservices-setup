package com.stream.product.catalogue.wishlist.model;


import com.stream.product.catalogue.wishlist.enums.*;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID productId;//findByProductId
    private String skuCode;// findBySkuCode
    private String brandName;


    private ProductCategory productCategory;
    private ProductSubCategory productSubCategory;
    private AgeGroup ageGroup;
    private Gender gender;
    private Color color;
    private Size size;



    private String productName;
    private String imageUrl;
    private BigDecimal price;
    private Double discount;
    private String arrival;// old, new
    private String manufacturedCompany;
    private String manufacturedCompanyLocation;//address
    private String manufacturedCompanyCountry;
    private String manufacturedDate;
    private String featureDetails;// like Electronics -> SmartPhone->>200mega pixel camera, dual camera, AI based adjustments etc
    private String description;


}

/**
   Category categoryObject= new Category(ProductCategory.ELECTRONICS, ProductSubCategory.SMARTPHONES,Gender.NONE,AgeGroup.ADULTS,Color.BLACK);
   Product product = new Product("Samsung Galaxy S21",799.99,category);
 * */
