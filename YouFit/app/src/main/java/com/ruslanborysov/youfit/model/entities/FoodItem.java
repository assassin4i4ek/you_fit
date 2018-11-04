package com.ruslanborysov.youfit.model.entities;

public abstract class FoodItem {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract float getKkal();
    public abstract float getProteins();
    public abstract float getFats();
    public abstract float getCarbs();
}
