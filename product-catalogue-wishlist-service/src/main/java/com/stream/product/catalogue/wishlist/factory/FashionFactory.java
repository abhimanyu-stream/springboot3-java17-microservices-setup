package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.FashionProduct;
import com.stream.product.catalogue.wishlist.util.SKUCode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class FashionFactory implements FashionProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories

    @Override
    public FashionProduct createFashionProduct(ProductRequest productRequest) {
        return new FashionProduct().builder()
                .productCategory(productRequest.getProductCategory())
                .productSubCategory(productRequest.getProductSubCategory())
                .brandName(productRequest.getBrandName())
                .productName(productRequest.getProductName())
                .productId(UUID.randomUUID())
                .skuCode(SKUCode.generateSkuCode(productRequest.getBrandName(),productRequest.getProductName(),productRequest.getProductCategory().toString(),productRequest.getProductSubCategory().toString()))
                .color(productRequest.getColor())
                .arrival(productRequest.getArrival())
                .gender(productRequest.getGender())
                .ageGroup(productRequest.getAgeGroup())
                .price(productRequest.getPrice())
                .discount(productRequest.getDiscount())
                .size(productRequest.getSize())
                .imageUrl(productRequest.getImageUrl())
                .manufacturedCompany(productRequest.getManufacturedCompany())
                .manufacturedCompanyCountry(productRequest.getManufacturedCompanyCountry())
                .manufacturedCompanyLocation(productRequest.getManufacturedCompanyLocation())
                .manufacturedDate(productRequest.getManufacturedDate())
                .description(productRequest.getDescription())
                .featureDetails(productRequest.getFeatureDetails())
                .build();
    }
}
