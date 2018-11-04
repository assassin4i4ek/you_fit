package com.ruslanborysov.youfit.model.entities;

public class ProductInfo {
    private int id;
    private String name;
    private float nominalKkal;
    private float nominalProteins;
    private float nominalFats;
    private float nominalCarbs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNominalKkal() {
        return nominalKkal;
    }

    public void setNominalKkal(float nominalKkal) {
        this.nominalKkal = nominalKkal;
    }

    public float getNominalProteins() {
        return nominalProteins;
    }

    public void setNominalProteins(float nominalProteins) {
        this.nominalProteins = nominalProteins;
    }

    public float getNominalFats() {
        return nominalFats;
    }

    public void setNominalFats(float nominalFats) {
        this.nominalFats = nominalFats;
    }

    public float getNominalCarbs() {
        return nominalCarbs;
    }

    public void setNominalCarbs(float nominalCarbs) {
        this.nominalCarbs = nominalCarbs;
    }
}
