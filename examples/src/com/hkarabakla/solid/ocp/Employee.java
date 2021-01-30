package com.hkarabakla.solid.ocp;

public class Employee extends Person {

    private Discounter<Product> discounter = (product) -> product.getBasePrice() * 0.9;
    // ... implementation


    public Discounter<Product> getDiscounter() {
        return discounter;
    }
}
