package com.ruslanborysov.youfit.model.entities;

import java.time.LocalDate;
import java.util.List;

public class DayInfo {
    private LocalDate date;
    private GoalEnum goal;
    private float bodyWeight;
    private float kkalLimit;
    private float proteinsLimit;
    private float fatsLimit;
    private float carbsLimit;
    private List<FoodEntry> consumptionList;

    public GoalEnum getGoal() {
        return goal;
    }

    public void setGoal(GoalEnum goal) {
        this.goal = goal;
    }

    public float getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(float bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public float getKkalLimit() {
        return kkalLimit;
    }

    public void setKkalLimit(float kkalLimit) {
        this.kkalLimit = kkalLimit;
    }

    public float getProteinsLimit() {
        return proteinsLimit;
    }

    public void setProteinsLimit(float proteinsLimit) {
        this.proteinsLimit = proteinsLimit;
    }

    public float getFatsLimit() {
        return fatsLimit;
    }

    public void setFatsLimit(float fatsLimit) {
        this.fatsLimit = fatsLimit;
    }

    public float getCarbsLimit() {
        return carbsLimit;
    }

    public void setCarbsLimit(float carbsLimit) {
        this.carbsLimit = carbsLimit;
    }

    public List<FoodEntry> getConsumptionList() {
        return consumptionList;
    }

    public void setConsumptionList(List<FoodEntry> consumptionList) {
        this.consumptionList = consumptionList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
