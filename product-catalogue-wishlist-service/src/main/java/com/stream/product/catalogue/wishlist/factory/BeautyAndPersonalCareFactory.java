package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.model.BeautyAndPersonalCareProduct;


public class BeautyAndPersonalCareFactory implements BeautyAndPersonalCareProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories
    @Override
    public BeautyAndPersonalCareProduct createBeautyAndPersonalCareProduct() {
        return new BeautyAndPersonalCareProduct();
    }
}

