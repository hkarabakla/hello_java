package com.hkarabakla.multithread;

public class MultiThreadDemoMain1 {

    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        MultiThreadDemo1 task = new MultiThreadDemo1("child1");

        Thread thread = new Thread(task);

        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        }

        System.out.println("Main thread is terminating");
    }
}
