package com.stream.product.catalogue.wishlist.factory;

import com.stream.product.catalogue.wishlist.model.FoodAndBeverageProduct;

public class FoodAndBeverageFactory implements FoodAndBeverageProductFactory {
    //ConcreteFactory
    //Step 4: Create Concrete Factories
    @Override
    public FoodAndBeverageProduct createFoodAndBeverageProduct() {
        return new FoodAndBeverageProduct();
    }
}
