package com.hkarabakla.multithread;

public class MultiThreadDemoMain6 {

    public static void main(String[] args) {

        int[] array = {1, 23, 45, 9, 52, 78};

        MultiThreadDemo6 thread1 = new MultiThreadDemo6(array);
        MultiThreadDemo6 thread2 = new MultiThreadDemo6(array);

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
