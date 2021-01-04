package com.hkarabakla.concurrency;

import java.util.concurrent.*;

public class CallableDemoMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Main thread gets started");

        int value = 10;

        Callable<Integer> factorial = () -> {
            int result = 1;
            for (int i = 1; i <= value; i++) {
                result *= i;
            }
            Thread.sleep(3000);
            return result;
        };

        Callable<Integer> sum = () -> {
            int result = 0;
            for (int i = 0; i < value; i++) {
                result += i;
            }
            Thread.sleep(3000);
            return result;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer> submitFactorial = executorService.submit(factorial);
        Future<Integer> submitSum = executorService.submit(sum);

        System.out.println("Future results are being collected");
        System.out.println("Factorial of " + value + " is " + submitFactorial.get());
        System.out.println("Sum of " + value + " is " + submitSum.get());
        System.out.println("Future results are collected");

        executorService.shutdown();
        System.out.println("Main thread completed");
    }
}
