package com.hkarabakla.oop.demo2;

import com.hkarabakla.oop.demo2.Vehicle;

public class OopDemo2 {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        System.out.println(
                "Brand " + minivan.brand +
                        " passengers : " + minivan.passengers +
                        " fuel capacity : " + minivan.fuelCapacity +
                        " consumption per km : " + minivan.fuelConsumptionPerKm +
                        " is sport car : " + minivan.isSport
        );
    }
}
