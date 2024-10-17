package com.stream.product.catalogue.wishlist.dto;

import com.stream.product.catalogue.wishlist.enums.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class ProductResponse {


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
