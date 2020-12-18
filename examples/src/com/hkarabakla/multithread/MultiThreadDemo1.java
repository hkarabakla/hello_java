package com.hkarabakla.multithread;

public class MultiThreadDemo1 implements Runnable {

    private String threadName;

    public MultiThreadDemo1(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is starting.");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println("In " + threadName + " count is " + i);
            } catch (InterruptedException e) {
                System.out.println(threadName + " is interrupted");
            }
        }

        System.out.println(threadName + " is terminating");
    }
}
