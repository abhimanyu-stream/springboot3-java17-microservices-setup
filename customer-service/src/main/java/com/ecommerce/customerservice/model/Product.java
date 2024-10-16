package com.ecommerce.customerservice.model;

import com.ecommerce.customerservice.enums.ProductCategory;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
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
    private String productName;
    private String imageUrl;
    private String color;
    private BigDecimal price;
    private Double discount;
    private String arrival;// old, new
    private String manufacturedCompany;
    private String manufacturedCompanyLocation;//address
    private String manufacturedCompanyCountry;
    private String manufacturedDate;
    private String description;
}