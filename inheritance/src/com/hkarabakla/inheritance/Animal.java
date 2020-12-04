package com.hkarabakla.inheritance;

abstract class Animal {
    String name;
    String mainLand;
    int averageLife;
    double averageHeight;
    double averageWeight;

    public Animal(String name, String mainLand, int averageLife, double averageHeight, double averageWeight) {
        this.name = name;
        this.mainLand = mainLand;
        this.averageLife = averageLife;
        this.averageHeight = averageHeight;
        this.averageWeight = averageWeight;
    }
}
