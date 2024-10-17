package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.model.HomeDecorationProduct;

public class HomeDecorationFactory implements HomeDecorationProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories
    @Override
    public HomeDecorationProduct createHomeDecorationProduct() {
        return new HomeDecorationProduct();
    }
}