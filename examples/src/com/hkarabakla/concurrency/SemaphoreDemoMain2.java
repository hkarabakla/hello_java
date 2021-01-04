package com.hkarabakla.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreDemoMain2 {

    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(1, true);

        SemaphoreDemo2 taskInc = new SemaphoreDemo2(true, "Incrementer", semaphore);
        SemaphoreDemo2 taskDec = new SemaphoreDemo2(false, "Decrementer", semaphore);

        Thread tInc = new Thread(taskInc);
        Thread tDec = new Thread(taskDec);

        tInc.start();
        tDec.start();

        tInc.join();
        tDec.join();
    }
}
