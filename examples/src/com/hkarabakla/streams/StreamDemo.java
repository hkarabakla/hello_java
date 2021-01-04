package com.hkarabakla.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        Stream<String> lines = getLinesFromAFile("anyFileName.txt");
    }

    private static Stream<String> getLinesFromAFile(String fullFileName) {
        Stream<String> lines;

        try {
            Path path = Paths.get(StreamDemo.class.getClassLoader().getResource("fileTest.txt").toURI());
            lines = Files.lines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            lines = Stream.empty();
        }

        return lines;
    }
}
