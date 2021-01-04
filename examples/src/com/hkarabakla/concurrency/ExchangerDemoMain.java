package com.hkarabakla.concurrency;

import java.util.concurrent.Exchanger;

public class ExchangerDemoMain {

    public static void main(String[] args) throws InterruptedException {

        Exchanger<String> exchanger = new Exchanger<>();
        ExchangerDemo task1 = new ExchangerDemo(exchanger, new String());
        ExchangerDemo2 task2 = new ExchangerDemo2(exchanger, new String());

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}
