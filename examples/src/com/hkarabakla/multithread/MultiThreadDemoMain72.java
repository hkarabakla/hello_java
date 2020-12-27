package com.hkarabakla.multithread;

public class MultiThreadDemoMain72 {

    static ArrayOperations op = new ArrayOperations();

    public static void main(String[] args) {

        int[] array = {1, 23, 45, 9, 52, 78};

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " is starting");
            synchronized (op) {
                System.out.println("Sum of the array is : " + op.sum(array));
            }

            System.out.println(Thread.currentThread().getName() + " is finishing");
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }

        System.out.println("Main thread is finishing");
    }
}
