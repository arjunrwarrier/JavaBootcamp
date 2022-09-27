package com.nest.restaurant;

public class FoodItems {
    Integer tea;
    Integer coffee;
    Integer limeJuice;
    Integer sandwich;
    Integer buger;

    public FoodItems(Integer tea, Integer coffee, Integer limeJuice, Integer sandwich, Integer buger) {
        this.tea = tea;
        this.coffee = coffee;
        this.limeJuice = limeJuice;
        this.sandwich = sandwich;
        this.buger = buger;
    }

    public Integer getTea() {
        return tea;
    }

    public void setTea(Integer tea) {
        this.tea = tea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }

    public Integer getLimeJuice() {
        return limeJuice;
    }

    public void setLimeJuice(Integer limeJuice) {
        this.limeJuice = limeJuice;
    }

    public Integer getSandwich() {
        return sandwich;
    }

    public void setSandwich(Integer sandwich) {
        this.sandwich = sandwich;
    }

    public Integer getBuger() {
        return buger;
    }

    public void setBuger(Integer buger) {
        this.buger = buger;
    }
}
