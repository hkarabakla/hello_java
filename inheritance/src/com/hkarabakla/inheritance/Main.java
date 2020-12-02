package com.hkarabakla.inheritance;

public class Main {

    public static void main(String[] args) {

        letTheAnimalSpeak(new Dog());
        letTheAnimalSpeak(new Ant());
    }

    static void letTheAnimalSpeak(Animal animal) {
        animal.speak();
    }
}
