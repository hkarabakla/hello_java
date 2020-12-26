package com.hkarabakla.multithread;

public class MultiThreadDemoMain8 {

    public static void main(String[] args) {

        MessageGenerator generator = new MessageGenerator();
        MultiThreadDemo8 thread1 = new MultiThreadDemo8("Tick", generator);
        MultiThreadDemo8 thread2 = new MultiThreadDemo8("Tock", generator);

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
