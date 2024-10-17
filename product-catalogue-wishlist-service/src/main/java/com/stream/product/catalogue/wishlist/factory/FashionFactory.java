package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.model.FashionProduct;

public class FashionFactory implements FashionProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories
    @Override
    public FashionProduct createFashionProduct() {
        return new FashionProduct();
    }
}
