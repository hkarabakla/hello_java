package com.hkarabakla.multithread;

public class MultiThreadDemo7 extends Thread {

    int[] array;
    static ArrayOperations op = new ArrayOperations();

    public MultiThreadDemo7(int[] array) {
        super();
        this.array = array;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " is starting");
        synchronized (op) {
            System.out.println("Sum of the array is : " + op.sum(this.array));
        }

        System.out.println(this.getName() + " is finishing");
    }
}
