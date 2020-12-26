package com.hkarabakla.multithread;

public class MultiThreadDemoMain7 {

    public static void main(String[] args) {

        int[] array = {1, 23, 45, 9, 52, 78};

        MultiThreadDemo7 thread1 = new MultiThreadDemo7(array);
        MultiThreadDemo7 thread2 = new MultiThreadDemo7(array);

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
