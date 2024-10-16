package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.FoodAndBeverageProduct;

public interface FoodAndBeverageProductFactory {
    public abstract FoodAndBeverageProduct createFoodAndBeverageProduct(ProductRequest productRequest);
}
