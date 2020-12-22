package com.hkarabakla.oop.gc;

public class Main {


    public static void main(String[] args) {
        Bicycle bianchi = new Bicycle("Bianchi", 21, 1);

        //bianchi.finalize();

        System.gc();

        System.out.println(bianchi.brand + " " + bianchi.numberOfSits + " " + bianchi.gear);
    }

}
