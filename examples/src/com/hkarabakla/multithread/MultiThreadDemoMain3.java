package com.hkarabakla.multithread;

public class MultiThreadDemoMain3 {

    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        MultiThreadDemo2 myThread = new MultiThreadDemo2("child1");
        MultiThreadDemo2 myThread2 = new MultiThreadDemo2("child2");
        MultiThreadDemo2 myThread3 = new MultiThreadDemo2("child3");

        myThread.start();
        myThread2.start();
        myThread3.start();

        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        } while (myThread.isAlive() || myThread2.isAlive() || myThread3.isAlive());

        System.out.println("Main thread is terminating");
    }
}
