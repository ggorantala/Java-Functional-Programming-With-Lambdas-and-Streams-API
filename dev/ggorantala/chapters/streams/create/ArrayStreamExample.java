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

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreamExample {
    private static final String[] NAMES = {"Alice", "Bob", "Charlie"};

    public static void main(String[] args) {

        Stream<String> stream = Arrays.stream(NAMES);

        // Perform operations on the stream
        stream.forEach(System.out::println);
    }
}
