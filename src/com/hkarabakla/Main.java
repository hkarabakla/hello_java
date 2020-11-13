package com.hkarabakla;

public class Main {

    public static void main(String[] args) {


        System.out.println(classifyFood("banana"));

    }


    public boolean isEligibleToHaveDrivingLicence(int age) {
        if(age < 18) {
            System.out.println("It's too early to drive !!!");
            return false;
        }

        return true;
    }

    public String getDayNameOfWeek(int dayOfTheWeek) {

        String nameOfTheDay;

        switch (dayOfTheWeek) {
            case 1:
                nameOfTheDay = "Monday";
                break;
            case 2:
                nameOfTheDay = "Tuesday";
                break;
            case 3:
                nameOfTheDay = "Wednesday";
                break;
            case 4:
                nameOfTheDay = "Thursday";
                break;
            case 5:
                nameOfTheDay = "Friday";
                break;
            case 6:
                nameOfTheDay = "Saturday";
                break;
            case 7:
                nameOfTheDay = "Sunday";
                break;
            default:
                nameOfTheDay = "Unknown";
                break;
        }

        return nameOfTheDay;
    }

    public static String classifyFood(String nameOfTheFood) {
        String foodType;

        switch (nameOfTheFood) {
            case "apple":
                System.out.println("This is an apple");
            case "banana":
                System.out.println("This can be an apple or banana");
                foodType = "fruit";
                break;
            case "aubergine":
                System.out.println("This is aubergine");
            case "broccoli":
                System.out.println("This can be an aubergine or broccoli");
                foodType = "vegetable";
                break;
            default:
                System.out.println("Don't eat that food");
                foodType = "Unknown";
                break;
        }

        return foodType;
    }
}
