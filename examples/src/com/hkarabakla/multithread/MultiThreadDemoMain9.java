package com.hkarabakla.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadDemoMain9 {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++) {
            executorService.submit(new MultiThreadDemo9());
        }

        executorService.shutdown();

        System.out.println("Main thread is finishing");
    }
}
