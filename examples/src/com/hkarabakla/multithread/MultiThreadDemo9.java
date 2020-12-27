package com.hkarabakla.multithread;

public class MultiThreadDemo9 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is starting");

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is finishing");
    }
}
