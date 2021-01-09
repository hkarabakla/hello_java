package com.hkarabakla.collection;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;

public class Main {

    public static void main (String[] args)
    {
        List<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");

        System.out.println(ar);


        Comparator<Student> myComparator = (o1, o2) -> o2.rollno - o1.rollno;

        Collections.sort(ar, myComparator);

        System.out.println("Sorted by rollno");
        System.out.println(ar);

        String[] values = {"1", "2", "3"};
        Arrays.stream(values)
                .map(val -> Integer.parseInt(val))
                .forEach(a -> System.out.println(a));
    }
}
