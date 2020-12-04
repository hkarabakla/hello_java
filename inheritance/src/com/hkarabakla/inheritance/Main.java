package com.hkarabakla.inheritance;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Lessi", "Anywhere on the earth", 15, 60, 35);
        Animal eagle = new Eagle("Rocky", "Rocks", 25, 60, 30);
        Animal puffin = new Puffin("Puffin", "North", 8, 40, 25);

        printSkills(dog);
        printSkills(eagle);
        printSkills(puffin);
    }

    static void printSkills(Animal animal) {
        if (animal instanceof Flyer) {
            ((Flyer) animal).fly();
        }

        if (animal instanceof Swimmer) {
            ((Swimmer) animal).swim();
        }

        if (animal instanceof Runner) {
            ((Runner) animal).run();
        }
    }
}
