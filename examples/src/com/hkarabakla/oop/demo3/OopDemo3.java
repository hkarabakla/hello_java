package com.hkarabakla.oop.demo3;

public class OopDemo3 {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        minivan.isSport = true;
        minivan.passengers = 7;
        minivan.fuelCapacity = 70;
        minivan.fuelConsumptionPerKm = 6;

        Vehicle bicycle = new Vehicle();
        bicycle.range();

        double range = minivan.range();
        System.out.println("Minivan can carry " + minivan.passengers + " people for " + range + " km");
    }
}
