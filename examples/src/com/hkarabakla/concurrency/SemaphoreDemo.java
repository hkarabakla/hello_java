package com.hkarabakla.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo extends Thread {

    Semaphore semaphore;

    public SemaphoreDemo(String name, Semaphore semaphore) {
        super(name);
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        if (this.getName().equals("Tick")) {
            MessageGenerator.tick(semaphore);
        } else {
            MessageGenerator.tock(semaphore);
        }
    }
}
