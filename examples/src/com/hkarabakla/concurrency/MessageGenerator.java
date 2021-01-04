package com.hkarabakla.concurrency;

import java.util.concurrent.Semaphore;

public class MessageGenerator {

    static void tick(Semaphore semaphore) {
        for (int i = 0; i < 5; i++) {
            try {
                semaphore.acquire();
                System.out.print("Tick ");
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static void tock(Semaphore sem) {
        for (int i = 0; i < 5; i++) {
            try {
                sem.acquire();
                System.out.println("tock");
                sem.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
