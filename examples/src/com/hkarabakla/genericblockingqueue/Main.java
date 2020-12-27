package com.hkarabakla.genericblockingqueue;

public class Main {

    public static void main(String[] args) {
        BlockingQueue<Integer> myIntQueue = new BlockingQueue<>();
        myIntQueue.add(1);
        myIntQueue.add(2);
        myIntQueue.add(3);
        myIntQueue.add(4);

        System.out.println(myIntQueue.peek());

        System.out.println(myIntQueue.poll());
        System.out.println(myIntQueue.poll());
        System.out.println(myIntQueue.poll());
        System.out.println(myIntQueue.poll());

        System.out.println("---------------------");
        BlockingQueue<String> myStrQueue = new BlockingQueue<>();
        myStrQueue.add("Kodluyoruz1");
        myStrQueue.add("Kodluyoruz2");
        myStrQueue.add("Kodluyoruz3");

        System.out.println(myStrQueue.poll());
        System.out.println(myStrQueue.poll());
        System.out.println(myStrQueue.poll());
        System.out.println(myStrQueue.poll());

    }
}
