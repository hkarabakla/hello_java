package com.hkarabakla.multithread;

public class MessageGenerator {

    String state;

    synchronized void tick(boolean running) {

        if (!running) {
            state = "ticked";
            notify();
            return;
        }

        System.out.print("Tick ");
        state = "ticked";

        notify();

        try {
            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void tock(boolean running) {

        if (!running) {
            state = "tocked";
            notify();
            return;
        }

        System.out.println("tock");
        state = "tocked";

        notify();

        try {
            while (!state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
