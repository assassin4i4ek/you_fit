package com.ruslanborysov.youfit.model.entities;

import java.util.List;

public class DishItem extends FoodItem {
    private String name;
    private String description;
    private List<ProductItem> productItems;

    public DishItem(List<ProductItem> productItems) {
        this.productItems = productItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductItem> getProductItems() {
        return productItems;
    }

    @Override
    public float getKkal() {
        float kkal = 0;
        for (ProductItem productItem : productItems)
            kkal += productItem.getKkal();
        return kkal;
    }

    @Override
    public float getProteins() {
        float proteins = 0;
        for (ProductItem productItem : productItems)
            proteins += productItem.getProteins();
        return proteins;
    }

    @Override
    public float getFats() {
        float fats = 0;
        for (ProductItem productItem : productItems)
            fats += productItem.getFats();
        return fats;
    }

    @Override
    public float getCarbs() {
        float carbs = 0;
        for (ProductItem productItem : productItems)
            carbs += productItem.getCarbs();
        return carbs;
    }
}