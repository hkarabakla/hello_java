package com.hkarabakla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LambdaExercise {

    public static void main(String[] args) {

        int[] values = {5, 6, 7, 8, 9, 10, 10, 5};

        Set<Integer> collect1 = Arrays.asList(5, 6, 7, 8, 9, 10, 10, 5)
                .stream()
                .collect(Collectors.toSet());



    }
}
