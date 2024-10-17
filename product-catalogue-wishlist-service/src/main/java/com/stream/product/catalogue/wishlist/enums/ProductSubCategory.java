package com.stream.product.catalogue.wishlist.enums;

import lombok.Getter;

@Getter
public enum ProductSubCategory {

    //Note remove arguments if some mismatch info store in db
    SMARTPHONES(ProductCategory.ELECTRONICS),
    LAPTOPS(ProductCategory.ELECTRONICS),
    DESKTOP(ProductCategory.ELECTRONICS),
    TABLET(ProductCategory.ELECTRONICS),

    CLOTHING(ProductCategory.FASHION),
    FOOTWEAR(ProductCategory.FASHION),
    SUNGLASS(ProductCategory.FASHION),


    DININGTABLE(ProductCategory.HOMEDECORATION),
    BEDSHEET(ProductCategory.HOMEDECORATION),

    RICE(ProductCategory.FOODANDBEVERAGE),

    MIXERGRINDER(ProductCategory.GROCERY),
    UTENSIL(ProductCategory.GROCERY),
    KITCHEN_APPLIANCES(ProductCategory.GROCERY),

    LITERATURE(ProductCategory.BOOKSMOVIESMUSICGAMES),
    BOOK(ProductCategory.BOOKSMOVIESMUSICGAMES),


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
