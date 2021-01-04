package com.hkarabakla.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main (String[] args)
    {
        List<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");

        System.out.println(ar);

        ar.sort();
        Comparator<Student> myComparator = (o1, o2) -> o2.rollno - o1.rollno;

        Collections.sort(ar, myComparator);

        System.out.println("Sorted by rollno");
        System.out.println(ar);
    }
}
