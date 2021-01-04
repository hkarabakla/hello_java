package com.hkarabakla.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemoMain {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(5);

        CountDownLatchDemo taskInc = new CountDownLatchDemo(true, "Incrementer", latch);
        CountDownLatchDemo taskDec = new CountDownLatchDemo(false, "Decrementer", latch);
        CountDownLatchDemo taskDec2 = new CountDownLatchDemo(false, "Decrementer2", latch);

        Thread tInc = new Thread(taskInc);
        Thread tDec = new Thread(taskDec);
        Thread tDec2 = new Thread(taskDec2);

        tInc.start();
        tDec.start();
        tDec2.start();

        tInc.join();
        tDec.join();
        tDec2.join();
    }
}
