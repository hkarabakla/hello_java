package com.hkarabakla.solid.ocp;

public class Person {
    private Discounter<Product> discounter = (product) -> product.getBasePrice();
    // ... implementation


    public Discounter<Product> getDiscounter() {
        return discounter;
    }
}
