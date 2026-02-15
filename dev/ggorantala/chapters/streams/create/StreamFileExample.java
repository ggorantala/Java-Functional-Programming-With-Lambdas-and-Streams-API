package dev.ggorantala.chapters.streams.create;
/*
 * This code is part of the course "Master Java 8(11/17) Functional Programming With Lambdas And Streams API"
 * for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 07/05/23
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("example.txt");

        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(System.out::println);
        }
    }
}
