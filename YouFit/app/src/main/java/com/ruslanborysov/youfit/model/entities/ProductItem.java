package com.ruslanborysov.youfit.model.entities;

public class ProductItem extends FoodItem {
    private int weight;
    private ProductInfo productInfo;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ProductInfo getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public float getKkal() {
        return (float) (weight * (productInfo.getNominalKkal() / 100.0));
    }

    @Override
    public float getProteins() {
        return (float) (weight * (productInfo.getNominalProteins() / 100.0));
    }

    @Override
    public float getFats() {
        return (float) (weight * (productInfo.getNominalFats() / 100.0));
    }

    @Override
    public float getCarbs() {
        return (float) (weight * (productInfo.getNominalCarbs() / 100.0));
    }
}
