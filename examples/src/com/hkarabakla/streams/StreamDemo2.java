package com.hkarabakla.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        int[] values = {5, 6, 7, 8, 9, 10};
        OptionalInt reduced = Arrays.stream(values).reduce((a, b) -> a * b);
        System.out.println(reduced.getAsInt());
    }
}
