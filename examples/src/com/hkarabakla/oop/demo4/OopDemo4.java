package com.hkarabakla.oop.demo4;

public class OopDemo4 {
    public static void main(String[] args) {

        SimpleMath simpleMath = new SimpleMath();
        int addThreeAndFive = simpleMath.add(3, 5);
        boolean factorElevenAndThree = simpleMath.isFactor(11, 3);
        int sum = simpleMath.addAll(new int[]{1, 2, 3});
    }
}
