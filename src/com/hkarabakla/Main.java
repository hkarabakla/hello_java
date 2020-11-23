package com.hkarabakla;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Main {

    public static void main(String[] args) {


        LocalTime now = LocalTime.now();
        System.out.println("Now : " + now);

        LocalTime evening = LocalTime.of(20, 0, 0);
        System.out.println("Evening : " + evening);

        LocalTime afterThirtyMinutes = LocalTime.now().plusMinutes(30);
        System.out.println("After 30 minutes from now : " + afterThirtyMinutes);

        long hoursToNewDay = LocalTime.now().until(LocalTime.of(23, 59, 59, 59), ChronoUnit.MINUTES);
        System.out.println("Remaining minutes to new day : " + hoursToNewDay);


//        LocalDate firstDayOfTheYear = LocalDate.of(2012, 1, 1);
//        System.out.println("firstDayOfTheYear " + firstDayOfTheYear);
//
//        LocalDate today = LocalDate.now();
//        System.out.println("today " + today);
//
//        LocalDate tomorrow = LocalDate.now().plusDays(1);
//        System.out.println("tomorrow " + tomorrow);
//
//        LocalDate nextMonth = LocalDate.now().withMonth(12);
//        System.out.println("nextMonth " + nextMonth);
//
//        LocalDate yesterday = LocalDate.parse("2020-11-22");
//        System.out.println("yesterday " + yesterday);
//
//        System.out.println("is today after tomorrow" + today.isAfter(tomorrow));
//        System.out.println("is today equals to yesterday" + today.isEqual(yesterday));
    }
}
