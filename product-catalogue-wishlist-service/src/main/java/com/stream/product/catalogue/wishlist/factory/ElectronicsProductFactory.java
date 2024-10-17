package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.dto.ProductRequest;
import com.stream.product.catalogue.wishlist.model.ElectronicsProduct;

public interface ElectronicsProductFactory {
    //Step 3: Define the Abstract Factory Interface

    ElectronicsProduct createElectronicsProduct(ProductRequest productRequest);
}
