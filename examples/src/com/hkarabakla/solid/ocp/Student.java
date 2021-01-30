package com.hkarabakla.solid.ocp;

public class Student extends Person {

    private Discounter<Product> discounter = (product) -> product.getBasePrice() * 0.8;
    // ... implementation


    public Discounter<Product> getDiscounter() {
        return discounter;
    }
}
