package com.hkarabakla.inheritance;

public interface NumericTest<T extends Number> {

    boolean test(T a, T b);
}
