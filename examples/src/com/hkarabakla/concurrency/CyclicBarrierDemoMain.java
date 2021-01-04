package com.hkarabakla.concurrency;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemoMain {

    public static void main(String[] args) throws InterruptedException {

        CyclicBarrier barrier = new CyclicBarrier(3, new CyclicBarrierAction());
        CyclicBarrierDemo cb1 = new CyclicBarrierDemo("T1", barrier);
        CyclicBarrierDemo cb2 = new CyclicBarrierDemo("T2", barrier);
        CyclicBarrierDemo cb3 = new CyclicBarrierDemo("T3", barrier);

        Thread t1 = new Thread(cb1);
        Thread t2 = new Thread(cb2);
        Thread t3 = new Thread(cb3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
