package com.hkarabakla.solid.ocp;

public interface Discounter<T extends Product> {

    double getPrice(T product);
}
