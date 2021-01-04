package com.hkarabakla.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo2 implements Runnable {

    private boolean increment;
    private String name;
    private Semaphore semaphore;

    public SemaphoreDemo2(boolean increment, String name, Semaphore semaphore) {
        this.increment = increment;
        this.name = name;
        this.semaphore = semaphore;
    }

    public void run() {
        try {
            semaphore.acquire();

            if (increment) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " value : " + SharedObject.incrementAndGet());
                    Thread.sleep(10);
                }
            } else {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " value : " + SharedObject.decrementAndGet());
                    Thread.sleep(10);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();
    }
}
