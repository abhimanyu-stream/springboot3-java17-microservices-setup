package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.GroceryProduct;

public interface GroceryProductFactory {
    public abstract GroceryProduct createGroceryProduct(ProductRequest productRequest);
}
