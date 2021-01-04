package com.hkarabakla.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreDemoMain {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(1, true);

        SemaphoreDemo thread1 = new SemaphoreDemo("Tick", semaphore);
        SemaphoreDemo thread2 = new SemaphoreDemo("Tock", semaphore);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Main thread is finishing");
    }
}
