package com.stream.product.catalogue.wishlist.enums;

import lombok.Getter;

@Getter
public enum ProductSubCategory {
    SMARTPHONES(ProductCategory.ELECTRONICS),
    LAPTOPS(ProductCategory.ELECTRONICS),
    DESKTOP(ProductCategory.ELECTRONICS),
    TABLET(ProductCategory.ELECTRONICS),
    CLOTHING(ProductCategory.FASHION),
    FOOTWEAR(ProductCategory.FASHION),
    KITCHEN_APPLIANCES(ProductCategory.HOMEDECORATION),
    RICE(ProductCategory.FOODANDBEVERAGE),
    MIXERGRINDER(ProductCategory.GROCERY),
    LITERATURE(ProductCategory.BOOKSMOVIESMUSICGAMES),
    PERFUME(ProductCategory.BEAUTYANDPERSONALCARE),
    CREAM(ProductCategory.BEAUTYANDPERSONALCARE),
    SOAP(ProductCategory.BEAUTYANDPERSONALCARE),
    SKINCARE(ProductCategory.BEAUTYANDPERSONALCARE);

    private final ProductCategory productCategory;

    ProductSubCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }
    public ProductCategory getParentCategory() {
        return productCategory;
    }

}
