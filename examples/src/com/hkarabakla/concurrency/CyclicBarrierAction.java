package com.hkarabakla.concurrency;

public class CyclicBarrierAction implements Runnable {

    private int counter = 0;

    public void run() {
        System.out.println(counter++ + ". Barrier achieved");
    }
}
