package com.hkarabakla.multithread;

public class MultiThreadDemoMain5 {
    public static void main(String[] args) {

        System.out.println("Number of processors : " + Runtime.getRuntime().availableProcessors());

        MultiThreadDemo5[] threads = new MultiThreadDemo5[30];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MultiThreadDemo5();
        }

        threads[0].setPriority(Thread.MAX_PRIORITY);
        threads[1].setPriority(Thread.MAX_PRIORITY);
        threads[2].setPriority(Thread.MAX_PRIORITY);
        threads[3].setPriority(Thread.MAX_PRIORITY);
        threads[4].setPriority(Thread.MIN_PRIORITY);
        threads[5].setPriority(Thread.MIN_PRIORITY);
        threads[6].setPriority(Thread.MIN_PRIORITY);

        for (MultiThreadDemo5 thead : threads) {
            thead.start();
        }

        try {
            for (MultiThreadDemo5 thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
