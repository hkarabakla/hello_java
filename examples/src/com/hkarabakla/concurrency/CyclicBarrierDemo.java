package com.hkarabakla.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo implements Runnable{

    private String name;
    private CyclicBarrier barrier;

    public CyclicBarrierDemo(String name, CyclicBarrier barrier) {
        this.barrier = barrier;
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is starting");

        for (int i = 1; i <= 15; i++) {
            if (i % 5 == 0) {
                try {
                    System.out.println(name + " is reached to " + i);
                    barrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(name + " is finishing");
    }
}
