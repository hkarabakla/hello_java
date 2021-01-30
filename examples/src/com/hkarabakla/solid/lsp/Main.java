package com.hkarabakla.solid.lsp;

public class Main {

    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();
        penguin.fly(); // ???
    }
}
