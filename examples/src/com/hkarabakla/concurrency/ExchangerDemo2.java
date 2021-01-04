package com.hkarabakla.concurrency;

import java.util.concurrent.Exchanger;

public class ExchangerDemo2 implements Runnable {

    private Exchanger<String> exchanger;
    private String value;

    public ExchangerDemo2(Exchanger<String> exchanger, String value) {
        this.exchanger = exchanger;
        this.value = value;
    }

    public void run() {
        try {
             do {
                value = exchanger.exchange(new String());
                if (value != null) {
                    System.out.println(value);
                } else {
                    break;
                }

            } while (true);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
