package com.hkarabakla.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo implements Runnable {

    private boolean increment;
    private String name;
    private CountDownLatch latch;

    public CountDownLatchDemo(boolean increment, String name, CountDownLatch latch) {
        this.increment = increment;
        this.name = name;
        this.latch = latch;
    }

    public void run() {
        try {
            if (increment) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " value : " + SharedObject.incrementAndGet());
                    Thread.sleep(10);
                    latch.countDown();
                }
            } else {
                latch.await();
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " value : " + SharedObject.decrementAndGet());
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
