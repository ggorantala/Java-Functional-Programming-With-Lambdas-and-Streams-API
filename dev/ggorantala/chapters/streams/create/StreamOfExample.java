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

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        stream1.forEach(System.out::println);

        Stream<String> stream2 = Stream.of("apple", "banana", "orange");
        stream2.forEach(System.out::println);
    }
}
