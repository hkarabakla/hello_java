package com.hkarabakla.inheritance;

public class Eagle extends Animal implements Flyer {


    public Eagle(String name, String mainLand, int averageLife, double averageHeight, double averageWeight) {
        super(name, mainLand, averageLife, averageHeight, averageWeight);
    }

    public void fly() {
        System.out.println("An eagle can fly");
    }
}
