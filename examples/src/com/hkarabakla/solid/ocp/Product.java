package com.hkarabakla.solid.ocp;

public class Product {

    private double basePrice;

    public Product(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
