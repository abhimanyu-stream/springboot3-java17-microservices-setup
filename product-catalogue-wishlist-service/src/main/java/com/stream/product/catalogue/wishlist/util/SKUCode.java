package com.stream.product.catalogue.wishlist.util;

import org.springframework.stereotype.Component;

import java.util.UUID;



public class SKUCode {
    private static String skuCode;


    public static String generateSkuCode(String brandName, String productName, String category, String subCategory) {
        String categoryCode = category.substring(0, 3).toUpperCase(); // First 3 letters of the category
        String subCategoryCode = subCategory.substring(0, 3).toUpperCase(); // First 3 letters of the subcategory
        String uniqueID = UUID.randomUUID().toString().substring(0, 8).toUpperCase(); // 8-character unique ID
        skuCode = brandName + "-" + productName + "-"+ categoryCode + "-" + subCategoryCode + "-" + uniqueID;
        return skuCode;
    }

}
