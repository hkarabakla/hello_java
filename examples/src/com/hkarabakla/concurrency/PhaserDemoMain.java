package com.hkarabakla.concurrency;

import java.util.concurrent.Phaser;

public class PhaserDemoMain {

    public static void main(String[] args) {

        int currentPhase;
        Phaser phaser = new Phaser();
        phaser.register();

        PhaserDemo p1 = new PhaserDemo("P1", phaser);
        PhaserDemo p2 = new PhaserDemo("P2", phaser);
        PhaserDemo p3 = new PhaserDemo("P3", phaser);

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phaser completed phase " + currentPhase);


        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phaser completed phase " + currentPhase);


        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phaser completed phase " + currentPhase);

        phaser.arriveAndDeregister();

        if( phaser.isTerminated()) {
            System.out.println("Phaser terminated");
        }
    }
}
