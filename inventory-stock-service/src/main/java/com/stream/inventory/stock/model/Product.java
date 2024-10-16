package com.stream.inventory.stock.model;

import com.stream.inventory.stock.enums.ProductCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "product")
public class Product extends Auditor implements Serializable {


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
