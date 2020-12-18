package com.hkarabakla.multithread;

public class MultiThreadDemo2 extends Thread {

    public MultiThreadDemo2(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is starting.");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
                System.out.println("In " + getName() + " count is " + i);
            } catch (InterruptedException e) {
                System.out.println(getName() + " is interrupted");
            }
        }

        System.out.println(getName() + " is terminating");
    }
}
