package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.model.GroceryProduct;

public class GroceryFactory implements GroceryProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories
    @Override
    public GroceryProduct createGroceryProduct() {
        return new GroceryProduct();
    }
}
