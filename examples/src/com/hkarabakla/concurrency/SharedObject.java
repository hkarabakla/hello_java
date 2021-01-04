package com.hkarabakla.concurrency;

public class SharedObject {

    private static int value = 0;

    static int incrementAndGet() {
        return ++value;
    }

    static int decrementAndGet() {
        return --value;
    }
}
