package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.HomeDecorationProduct;

public interface HomeDecorationProductFactory {
    public abstract HomeDecorationProduct createHomeDecorationProduct(ProductRequest productRequest);
}
